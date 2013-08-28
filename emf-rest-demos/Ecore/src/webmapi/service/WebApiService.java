package webmapi.service;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;

import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.service.*;

@Path("")
public class WebApiService {

	@Context
	private HttpServletRequest request;

	private webmapi.storage.IModelStorage storage;

	private void initStorage() {
		if (storage == null) {
			String modelsPath = request.getServletContext().getRealPath("models");
			storage = new webmapi.storage.MemoryStorage(modelsPath);
		}
	}

	@Path("EAttribute/{id}")
	public EAttributeResource handleEAttribute(@PathParam("id") String id) {
		return new EAttributeResource((EAttribute) storage.get(
				"org.eclipse.emf.ecore.EAttribute", id));
	}

	@Path("EPackage/{id}")
	public EPackageResource handleEPackage(@PathParam("id") String id) {
		initStorage();
		return new EPackageResource((EPackage) storage.get(
				"org.eclipse.emf.ecore.EPackage", id));
	}

	@POST
	@Path("EAttribute")
	public void createEAttribute(EAttribute obj) {
		String id = IdentificationResolver.getEAttributeId(obj);
		storage.put("org.eclipse.emf.ecore.EAttribute", id, obj);
	}

	@DELETE
	@Path("EAttribute/{id}")
	public void deleteEAttribute(@PathParam("id") String id) {
		storage.remove("org.eclipse.emf.ecore.EAttribute", id);
	}

	@Path("EClass/{id}")
	public EClassResource handleEClass(@PathParam("id") String id) {
		return new EClassResource((EClass) storage.get(
				"org.eclipse.emf.ecore.EClass", id));
	}

	@POST
	@Path("EClass")
	public void createEClass(EClass obj) {
		String id = IdentificationResolver.getEClassId(obj);
		storage.put("org.eclipse.emf.ecore.EClass", id, obj);
	}

	@DELETE
	@Path("EClass/{id}")
	public void deleteEClass(@PathParam("id") String id) {
		storage.remove("org.eclipse.emf.ecore.EClass", id);
	}

	@Path("EDataType/{id}")
	public EDataTypeResource handleEDataType(@PathParam("id") String id) {
		return new EDataTypeResource((EDataType) storage.get(
				"org.eclipse.emf.ecore.EDataType", id));
	}

	@POST
	@Path("EDataType")
	public void createEDataType(EDataType obj) {
		String id = IdentificationResolver.getEDataTypeId(obj);
		storage.put("org.eclipse.emf.ecore.EDataType", id, obj);
	}

	@DELETE
	@Path("EDataType/{id}")
	public void deleteEDataType(@PathParam("id") String id) {
		storage.remove("org.eclipse.emf.ecore.EDataType", id);
	}

	@Path("EEnum/{id}")
	public EEnumResource handleEEnum(@PathParam("id") String id) {
		return new EEnumResource((EEnum) storage.get(
				"org.eclipse.emf.ecore.EEnum", id));
	}

	@POST
	@Path("EEnum")
	public void createEEnum(EEnum obj) {
		String id = IdentificationResolver.getEEnumId(obj);
		storage.put("org.eclipse.emf.ecore.EEnum", id, obj);
	}

	@DELETE
	@Path("EEnum/{id}")
	public void deleteEEnum(@PathParam("id") String id) {
		storage.remove("org.eclipse.emf.ecore.EEnum", id);
	}

	@Path("EFactory/{id}")
	public EFactoryResource handleEFactory(@PathParam("id") String id) {
		return new EFactoryResource((EFactory) storage.get(
				"org.eclipse.emf.ecore.EFactory", id));
	}

	@POST
	@Path("EFactory")
	public void createEFactory(EFactory obj) {
		String id = IdentificationResolver.getEFactoryId(obj);
		storage.put("org.eclipse.emf.ecore.EFactory", id, obj);
	}

	@DELETE
	@Path("EFactory/{id}")
	public void deleteEFactory(@PathParam("id") String id) {
		storage.remove("org.eclipse.emf.ecore.EFactory", id);
	}

	@Path("EReference/{id}")
	public EReferenceResource handleEReference(@PathParam("id") String id) {
		return new EReferenceResource((EReference) storage.get(
				"org.eclipse.emf.ecore.EReference", id));
	}

	@POST
	@Path("EReference")
	public void createEReference(EReference obj) {
		String id = IdentificationResolver.getEReferenceId(obj);
		storage.put("org.eclipse.emf.ecore.EReference", id, obj);
	}

	@DELETE
	@Path("EReference/{id}")
	public void deleteEReference(@PathParam("id") String id) {
		storage.remove("org.eclipse.emf.ecore.EReference", id);
	}
}
