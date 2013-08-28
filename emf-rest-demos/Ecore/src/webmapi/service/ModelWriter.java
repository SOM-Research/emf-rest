
package webmapi.service;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;	
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List; 

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
public class ModelWriter implements MessageBodyWriter<Object> {

	@Context
	private HttpServletRequest request;

	private final static HashMap<String, Integer> entityRegistry;

	static {
		entityRegistry = new HashMap<String, Integer>();
		   entityRegistry.put("EAttribute", 0);
		   entityRegistry.put("EAnnotation", 1);
		   entityRegistry.put("EClass", 2);
		   entityRegistry.put("EClassifier", 3);
		   entityRegistry.put("EDataType", 4);
		   entityRegistry.put("EEnum", 5);
		   entityRegistry.put("EEnumLiteral", 6);
		   entityRegistry.put("EFactory", 7);
		   entityRegistry.put("EModelElement", 8);
		   entityRegistry.put("ENamedElement", 9);
		   entityRegistry.put("EObject", 10);
		   entityRegistry.put("EOperation", 11);
		   entityRegistry.put("EPackage", 12);
		   entityRegistry.put("EParameter", 13);
		   entityRegistry.put("EReference", 14);
		   entityRegistry.put("EStructuralFeature", 15);
		   entityRegistry.put("ETypedElement", 16);
		   entityRegistry.put("EStringToStringMapEntry", 17);
		   entityRegistry.put("EGenericType", 18);
		   entityRegistry.put("ETypeParameter", 19);
	    entityRegistry.put("List", 20);
	     entityRegistry.put("EClassifierContainer", 21);
	     entityRegistry.put("EDataTypeContainer", 22);
	     entityRegistry.put("EModelElementContainer", 23);
	     entityRegistry.put("ENamedElementContainer", 24);
	     entityRegistry.put("EStructuralFeatureContainer", 25);
	     entityRegistry.put("ETypedElementContainer", 26);
	}

	
	public long getSize(Object obj, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		return -1;
	}

	
	public boolean isWriteable(Class<?> clazz, Type arg1, Annotation[] arg2, MediaType arg3) {
		if (entityRegistry.get(getClassName(clazz)) != null) {
			return true;
		} else {
			return false;
		}
	}

	private String getClassName(Class originalClass) {
		String originalClassName = originalClass.getSimpleName();
		if (originalClassName.endsWith("Impl")) {
			return originalClassName.substring(0,
					originalClassName.length() - 4); 
		} else if (List.class.isAssignableFrom(originalClass)) {
			return "List";
		} else {
			return originalClassName;
		}
	}
	
	public void writeTo(Object obj, Class<?> clazz, Type type, Annotation[] arg3, MediaType arg4, MultivaluedMap<String, Object> arg5, OutputStream output) throws IOException {
		String sDepth = request.getParameter("depth");
		int depth = -1;
		if (sDepth != null && !sDepth.isEmpty()) {
			depth = new Integer(sDepth);
		}
		System.out.println("Creating the resource");
		String className = getClassName(clazz);
		Integer position = entityRegistry.get(className);
		switch (position) {
		case 0:
			webmapi.service.EAttributeSerializer.serialize((org.eclipse.emf.ecore.EAttribute)obj, depth, output);	
			break;
		case 1:
			webmapi.service.EAnnotationSerializer.serialize((org.eclipse.emf.ecore.EAnnotation)obj, depth, output);	
			break;
		case 2:
			webmapi.service.EClassSerializer.serialize((org.eclipse.emf.ecore.EClass)obj, depth, output);	
			break;
		case 3:
			webmapi.service.EClassifierSerializer.serialize((org.eclipse.emf.ecore.EClassifier)obj, depth, output);	
			break;
		case 4:
			webmapi.service.EDataTypeSerializer.serialize((org.eclipse.emf.ecore.EDataType)obj, depth, output);	
			break;
		case 5:
			webmapi.service.EEnumSerializer.serialize((org.eclipse.emf.ecore.EEnum)obj, depth, output);	
			break;
		case 6:
			webmapi.service.EEnumLiteralSerializer.serialize((org.eclipse.emf.ecore.EEnumLiteral)obj, depth, output);	
			break;
		case 7:
			webmapi.service.EFactorySerializer.serialize((org.eclipse.emf.ecore.EFactory)obj, depth, output);	
			break;
		case 8:
			webmapi.service.EModelElementSerializer.serialize((org.eclipse.emf.ecore.EModelElement)obj, depth, output);	
			break;
		case 9:
			webmapi.service.ENamedElementSerializer.serialize((org.eclipse.emf.ecore.ENamedElement)obj, depth, output);	
			break;
		case 10:
			webmapi.service.EObjectSerializer.serialize((org.eclipse.emf.ecore.EObject)obj, depth, output);	
			break;
		case 11:
			webmapi.service.EOperationSerializer.serialize((org.eclipse.emf.ecore.EOperation)obj, depth, output);	
			break;
		case 12:
			webmapi.service.EPackageSerializer.serialize((org.eclipse.emf.ecore.EPackage)obj, depth, output);	
			break;
		case 13:
			webmapi.service.EParameterSerializer.serialize((org.eclipse.emf.ecore.EParameter)obj, depth, output);	
			break;
		case 14:
			webmapi.service.EReferenceSerializer.serialize((org.eclipse.emf.ecore.EReference)obj, depth, output);	
			break;
		case 15:
			webmapi.service.EStructuralFeatureSerializer.serialize((org.eclipse.emf.ecore.EStructuralFeature)obj, depth, output);	
			break;
		case 16:
			webmapi.service.ETypedElementSerializer.serialize((org.eclipse.emf.ecore.ETypedElement)obj, depth, output);	
			break;
		case 17:
			//webmapi.service.EStringToStringMapEntrySerializer.serialize((org.eclipse.emf.ecore.EStringToStringMapEntry)obj, depth, output);	
			break;
		case 18:
			webmapi.service.EGenericTypeSerializer.serialize((org.eclipse.emf.ecore.EGenericType)obj, depth, output);	
			break;
		case 19:
			webmapi.service.ETypeParameterSerializer.serialize((org.eclipse.emf.ecore.ETypeParameter)obj, depth, output);	
			break;
		case 20:
		System.out.println(type.toString());
		Class listClass = null;
		try {
			listClass = (Class) ((ParameterizedType) type)
					.getActualTypeArguments()[0];
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(listClass);
			if (listClass == null) {
				position = 0;
				obj = java.util.Collections.EMPTY_LIST;
				List list = null;
				try {
					list = (List) obj;
				} catch (Exception e) {
				}
				if (obj != null && !list.isEmpty()) {
					// Find an object to check for the type
					for (Object listObject : list) {
						if (listObject != null) {
							position = entityRegistry.get(getClassName(listObject.getClass()));
							break;
						}
					}
				}
			} else {
				position = entityRegistry.get(getClassName(listClass));
			}
		switch (position) {
		case 0:
			webmapi.service.EAttributeSerializer.serializeEAttributeList((List)obj, depth, output);	
			break;
		case 1:
			webmapi.service.EAnnotationSerializer.serializeEAnnotationList((List)obj, depth, output);	
			break;
		case 2:
			webmapi.service.EClassSerializer.serializeEClassList((List)obj, depth, output);	
			break;
		case 3:
			webmapi.service.EClassifierSerializer.serializeEClassifierList((List)obj, depth, output);	
			break;
		case 4:
			webmapi.service.EDataTypeSerializer.serializeEDataTypeList((List)obj, depth, output);	
			break;
		case 5:
			webmapi.service.EEnumSerializer.serializeEEnumList((List)obj, depth, output);	
			break;
		case 6:
			webmapi.service.EEnumLiteralSerializer.serializeEEnumLiteralList((List)obj, depth, output);	
			break;
		case 7:
			webmapi.service.EFactorySerializer.serializeEFactoryList((List)obj, depth, output);	
			break;
		case 8:
			webmapi.service.EModelElementSerializer.serializeEModelElementList((List)obj, depth, output);	
			break;
		case 9:
			webmapi.service.ENamedElementSerializer.serializeENamedElementList((List)obj, depth, output);	
			break;
		case 10:
			webmapi.service.EObjectSerializer.serializeEObjectList((List)obj, depth, output);	
			break;
		case 11:
			webmapi.service.EOperationSerializer.serializeEOperationList((List)obj, depth, output);	
			break;
		case 12:
			webmapi.service.EPackageSerializer.serializeEPackageList((List)obj, depth, output);	
			break;
		case 13:
			webmapi.service.EParameterSerializer.serializeEParameterList((List)obj, depth, output);	
			break;
		case 14:
			webmapi.service.EReferenceSerializer.serializeEReferenceList((List)obj, depth, output);	
			break;
		case 15:
			webmapi.service.EStructuralFeatureSerializer.serializeEStructuralFeatureList((List)obj, depth, output);	
			break;
		case 16:
			webmapi.service.ETypedElementSerializer.serializeETypedElementList((List)obj, depth, output);	
			break;
		case 17:
			//webmapi.service.EStringToStringMapEntrySerializer.serializeEStringToStringMapEntryList((List)obj, depth, output);	
			break;
		case 18:
			webmapi.service.EGenericTypeSerializer.serializeEGenericTypeList((List)obj, depth, output);	
			break;
		case 19:
			webmapi.service.ETypeParameterSerializer.serializeETypeParameterList((List)obj, depth, output);	
			break;
		}
		break;
	     case 21:
	     webmapi.service.EClassifierContainerSerializer.serialize((webmapi.service.container.EClassifierContainer) obj, depth, output);
	     break;
	     case 22:
	     webmapi.service.EDataTypeContainerSerializer.serialize((webmapi.service.container.EDataTypeContainer) obj, depth, output);
	     break;
	     case 23:
	     webmapi.service.EModelElementContainerSerializer.serialize((webmapi.service.container.EModelElementContainer) obj, depth, output);
	     break;
	     case 24:
	     webmapi.service.ENamedElementContainerSerializer.serialize((webmapi.service.container.ENamedElementContainer) obj, depth, output);
	     break;
	     case 25:
	     webmapi.service.EStructuralFeatureContainerSerializer.serialize((webmapi.service.container.EStructuralFeatureContainer) obj, depth, output);
	     break;
	     case 26:
	     webmapi.service.ETypedElementContainerSerializer.serialize((webmapi.service.container.ETypedElementContainer) obj, depth, output);
	     break;
		}
	}

}