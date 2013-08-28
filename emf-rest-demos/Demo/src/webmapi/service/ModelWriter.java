
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
		   entityRegistry.put("Family", 0);
		   entityRegistry.put("Member", 1);
		   entityRegistry.put("Parent", 2);
		   entityRegistry.put("Son", 3);
		   entityRegistry.put("Daughter", 4);
		   entityRegistry.put("Pet", 5);
		   entityRegistry.put("Dog", 6);
		   entityRegistry.put("Cat", 7);
		   entityRegistry.put("RaceDog", 8);
		   entityRegistry.put("HuntingDog", 9);
	    entityRegistry.put("List", 10);
	     entityRegistry.put("MemberContainer", 11);
	     entityRegistry.put("PetContainer", 12);
	     entityRegistry.put("DogContainer", 13);
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
			webmapi.service.FamilySerializer.serialize((Example.Family)obj, depth, output);	
			break;
		case 1:
			webmapi.service.MemberSerializer.serialize((Example.Member)obj, depth, output);	
			break;
		case 2:
			webmapi.service.ParentSerializer.serialize((Example.Parent)obj, depth, output);	
			break;
		case 3:
			webmapi.service.SonSerializer.serialize((Example.Son)obj, depth, output);	
			break;
		case 4:
			webmapi.service.DaughterSerializer.serialize((Example.Daughter)obj, depth, output);	
			break;
		case 5:
			webmapi.service.PetSerializer.serialize((Example.Pet)obj, depth, output);	
			break;
		case 6:
			webmapi.service.DogSerializer.serialize((Example.Dog)obj, depth, output);	
			break;
		case 7:
			webmapi.service.CatSerializer.serialize((Example.Cat)obj, depth, output);	
			break;
		case 8:
			webmapi.service.RaceDogSerializer.serialize((Example.RaceDog)obj, depth, output);	
			break;
		case 9:
			webmapi.service.HuntingDogSerializer.serialize((Example.HuntingDog)obj, depth, output);	
			break;
		case 10:
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
			webmapi.service.FamilySerializer.serializeFamilyList((List)obj, depth, output);	
			break;
		case 1:
			webmapi.service.MemberSerializer.serializeMemberList((List)obj, depth, output);	
			break;
		case 2:
			webmapi.service.ParentSerializer.serializeParentList((List)obj, depth, output);	
			break;
		case 3:
			webmapi.service.SonSerializer.serializeSonList((List)obj, depth, output);	
			break;
		case 4:
			webmapi.service.DaughterSerializer.serializeDaughterList((List)obj, depth, output);	
			break;
		case 5:
			webmapi.service.PetSerializer.serializePetList((List)obj, depth, output);	
			break;
		case 6:
			webmapi.service.DogSerializer.serializeDogList((List)obj, depth, output);	
			break;
		case 7:
			webmapi.service.CatSerializer.serializeCatList((List)obj, depth, output);	
			break;
		case 8:
			webmapi.service.RaceDogSerializer.serializeRaceDogList((List)obj, depth, output);	
			break;
		case 9:
			webmapi.service.HuntingDogSerializer.serializeHuntingDogList((List)obj, depth, output);	
			break;
		}
		break;
	     case 11:
	     webmapi.service.MemberContainerSerializer.serialize((webmapi.service.container.MemberContainer) obj, depth, output);
	     break;
	     case 12:
	     webmapi.service.PetContainerSerializer.serialize((webmapi.service.container.PetContainer) obj, depth, output);
	     break;
	     case 13:
	     webmapi.service.DogContainerSerializer.serialize((webmapi.service.container.DogContainer) obj, depth, output);
	     break;
		}
	}

}