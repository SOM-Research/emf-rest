package webmapi.storage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.net.URISyntaxException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


import webmapi.service.configuration.ModelEnvironmentManager;
import Example.ExamplePackage;

public class MemoryStorage implements IModelStorage {

	private final static HashMap<String, EObject> store = new HashMap<String, EObject>();
	private String modelsPath;

	public MemoryStorage(String modelsPath) {
		this.modelsPath = modelsPath;
		
	}

	@Override
	public Object get(String type, String id) {

		String composedId = type + "/" + id;
		if (store.get(composedId) == null) {
			store.put(composedId, ModelEnvironmentManager.getInstance(modelsPath)
					.getResource().getContents().get(0));
			return ModelEnvironmentManager.getInstance(modelsPath).getResource()
					.getContents().get(0);
		} else {
			return store.get(composedId);
		}
	}

	@Override
	public void put(String type, String id, EObject value) {
		String composedId = type + "/" + id;
		if (store.get(composedId) == null) {
			EObject obj = getEObjectByID(type, id);
			store.put(composedId, obj);
		}
	
		EObject obj = store.get(composedId);
		System.out.println(obj.eClass().getInstanceTypeName());
		EList<EAttribute> eAttributes = obj.eClass().getEAllAttributes();
		for (EAttribute eAttribute : eAttributes) {

			obj.eSet(eAttribute, value.eGet(eAttribute));
			store.remove(composedId);
		}
		Diagnostic d = Diagnostician.INSTANCE.validate(obj);
		if(d.getSeverity() == Diagnostic.ERROR)
			throw new WebApplicationException(Status.BAD_REQUEST);
		try {
			ModelEnvironmentManager.getInstance(modelsPath).getResource()
					.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void put(String id, EObject value) {
		if (store.get(id) == null) {
			EObject obj = getEObjectByID(id);
			store.put(id, obj);
		}
	
		EObject obj = store.get(id);
		System.out.println(obj.eClass().getInstanceTypeName());
		EList<EAttribute> eAttributes = obj.eClass().getEAllAttributes();
		for (EAttribute eAttribute : eAttributes) {
			obj.eSet(eAttribute, value.eGet(eAttribute));
			store.remove(id);
		}
		Diagnostic d = Diagnostician.INSTANCE.validate(obj);
		if(d.getSeverity() == Diagnostic.ERROR)
			throw new WebApplicationException(Status.BAD_REQUEST);
		try {
			ModelEnvironmentManager.getInstance(modelsPath).getResource()
					.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private EObject getEObjectByID(String type, String id) {
		TreeIterator<EObject> eAllContents = ModelEnvironmentManager
				.getInstance(modelsPath).getResource().getAllContents();
		while (eAllContents.hasNext()) {
			EObject next = eAllContents.next();
			System.out.println(next.eClass().getInstanceTypeName().equals(type));
			System.out.println(next.eClass().getInstanceTypeName());
			System.out.println(id);
			System.out.println(EcoreUtil.getID(next));
			if (next.eClass().getInstanceTypeName().equals(type)
					&& EcoreUtil.getID(next) != null && EcoreUtil.getID(next).equals(id))
				return next;
		}
		throw new WebApplicationException(Response.Status.NOT_FOUND);
	}
	private EObject getEObjectByID( String id) {
		TreeIterator<EObject> eAllContents = ModelEnvironmentManager
				.getInstance(modelsPath).getResource().getAllContents();
		while (eAllContents.hasNext()) {
			EObject next = eAllContents.next();
			System.out.println(EcoreUtil.getIdentification(next).equals(id));
			System.out.println(id);
			System.out.println(EcoreUtil.getID(next));
			if (EcoreUtil.getIdentification(next).equals(id))
				return next;
		}
		throw new WebApplicationException(Response.Status.NOT_FOUND);
	}

	@Override
	public Object remove(String type, String id) {
		String composedId = type + "/" + id;
		System.out.println(composedId);
		if (store.get(composedId) == null) {
			EObject obj = getEObjectByID(type, id);
			store.put(composedId, obj);
		}
		EObject obj = store.get(composedId);
		EcoreUtil.delete(obj);
		store.remove(composedId);
		Diagnostic d = Diagnostician.INSTANCE.validate(obj);
		if(d.getSeverity() == Diagnostic.ERROR)
			throw new WebApplicationException(Status.BAD_REQUEST);
		try {
			ModelEnvironmentManager.getInstance(modelsPath).getResource()
					.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void save() {
		
		try {
			ModelEnvironmentManager.getInstance(modelsPath).getResource()
					.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Object remove(String id) {
		if (store.get(id) == null) {
			EObject obj = getEObjectByID( id);
			store.put(id, obj);
		}
		EObject obj = store.get(id);
		EcoreUtil.delete(obj);
		store.remove(id);
		try {
			ModelEnvironmentManager.getInstance(modelsPath).getResource()
					.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

