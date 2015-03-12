package webmapi.util;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import webmapi.admin.ParameterRepository;
import webmapi.model.Parameter;



@Singleton
public class ResourceSaver {
	
	@Inject
	private ResourceLoader resourceLoader;
	
	@Inject
	private ParameterRepository parameterRepository;
	
	private Parameter validation;
	
	@PostConstruct
	public void init(){
		validation = parameterRepository.findById( new Long(1));
		
	}
	
	 public void onUserListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final Parameter validation) {
	    	init();
	    }

	private final static HashMap<String, EObject> store = new HashMap<String, EObject>();
	
	
	@Lock(LockType.WRITE)
	public Object get(String type, String id) {

		String composedId = type + "/" + id;
		if (store.get(composedId) == null) {
			store.put(composedId,resourceLoader
					.getResource().getContents().get(0));
			return resourceLoader.getResource()
					.getContents().get(0);
		} else {
			return store.get(composedId);
		}
	}

	@Lock(LockType.WRITE)
	public void put(String type, String id, EObject value) {
		String composedId = type + "/" + id;
		if (store.get(composedId) == null) {
			EObject obj = getEObjectByID(type, id);
			store.put(composedId, obj);
		}
	
		EObject obj = store.get(composedId);
		EList<EAttribute> eAttributes = obj.eClass().getEAllAttributes();
		for (EAttribute eAttribute : eAttributes) {

			obj.eSet(eAttribute, value.eGet(eAttribute));
			store.remove(composedId);
		}
		if(validation.getFlag()){
		Diagnostic d = Diagnostician.INSTANCE.validate(obj);
		if(d.getSeverity() == Diagnostic.ERROR)
			throw new WebApplicationException(Status.BAD_REQUEST);
		}
		try {
			resourceLoader.getResource()
					.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Lock(LockType.WRITE)
	public void put(String id, EObject value) {
		if (store.get(id) == null) {
			EObject obj = getEObjectByID(id);
			store.put(id, obj);
		}
	
		EObject obj = store.get(id);
		EList<EAttribute> eAttributes = obj.eClass().getEAllAttributes();
		for (EAttribute eAttribute : eAttributes) {
			obj.eSet(eAttribute, value.eGet(eAttribute));
			store.remove(id);
		}
		if(validation.getFlag()){
		Diagnostic d = Diagnostician.INSTANCE.validate(obj);
		if(d.getSeverity() == Diagnostic.ERROR)
			throw new WebApplicationException(Status.BAD_REQUEST);
		}
		try {
			resourceLoader.getResource()
					.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Lock(LockType.WRITE)
	private EObject getEObjectByID(String type, String id) {
		TreeIterator<EObject> eAllContents = resourceLoader.getResource().getAllContents();
		while (eAllContents.hasNext()) {
			EObject next = eAllContents.next();
			if (next.eClass().getInstanceTypeName().equals(type)
					&& EcoreUtil.getID(next) != null && EcoreUtil.getID(next).equals(id))
				return next;
		}
		throw new WebApplicationException(Response.Status.NOT_FOUND);
	}
	private EObject getEObjectByID( String id) {
		TreeIterator<EObject> eAllContents = resourceLoader.getResource().getAllContents();
		while (eAllContents.hasNext()) {
			EObject next = eAllContents.next();
			if (EcoreUtil.getIdentification(next).equals(id))
				return next;
		}
		throw new WebApplicationException(Response.Status.NOT_FOUND);
	}

	@Lock(LockType.WRITE)
	public Object remove(String type, String id) {
		String composedId = type + "/" + id;
		System.out.println(composedId);
		if (store.get(composedId) == null) {
			EObject obj = getEObjectByID(type, id);
			store.put(composedId, obj);
		}
		EObject obj = store.get(composedId);
		EcoreUtil.delete(obj);
		if(validation.getFlag()){
		Diagnostic d = Diagnostician.INSTANCE.validate(obj);
		if(d.getSeverity() == Diagnostic.ERROR)
			throw new WebApplicationException(Status.BAD_REQUEST);
		}
		store.remove(composedId);
		try {
			resourceLoader.getResource()
					.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Lock(LockType.WRITE)
	public void save() {
		
		try {
			resourceLoader.getResource()
					.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Lock(LockType.WRITE)
	public Object remove(String id) {
		if (store.get(id) == null) {
			EObject obj = getEObjectByID( id);
			store.put(id, obj);
		}
		EObject obj = store.get(id);
		if(validation.getFlag()){
			Diagnostic d = Diagnostician.INSTANCE.validate(obj);
			if(d.getSeverity() == Diagnostic.ERROR)
				throw new WebApplicationException(Status.BAD_REQUEST);
			}
		
		EcoreUtil.delete(obj);
		store.remove(id);
		try {
			resourceLoader.getResource()
					.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
