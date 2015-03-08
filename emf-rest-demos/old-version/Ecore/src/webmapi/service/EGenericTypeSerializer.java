
package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONWriter;

public final class EGenericTypeSerializer { 
 public static String serializeEGenericTypeList(java.util.List<org.eclipse.emf.ecore.EGenericType> obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (org.eclipse.emf.ecore.EGenericType oi : obj) {
            generateJSONObject(jw, (org.eclipse.emf.ecore.EGenericType)oi, new HashMap<String, String>(), new StringBuffer(), depth);
        }
        jw.endArray();
        if (out == null) {
            try {
                return bStream.toString("utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        pw.flush();
        pw.close();
        return null;
    }


	public final static String serialize(org.eclipse.emf.ecore.EGenericType obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize(org.eclipse.emf.ecore.EGenericType obj, int depth, OutputStream out) {
		ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? bStream : out);
        JSONWriter jw = new JSONWriter(pw);
        generateJSONObject(jw, obj, new HashMap<String, String>(), new StringBuffer(), depth);
        if (out == null) {
            try {
                return bStream.toString("utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } 
        pw.flush();
        pw.close();
        return null;
	}
	public final static void generateJSONObject(JSONWriter jw, org.eclipse.emf.ecore.EGenericType obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
		jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
		}
		// for each attribute
 
		serialized.put("EGenericType"+IdentificationResolver.getEGenericTypeId(obj), "t");
		if (depth > 0) {
	    jw.key("eUpperBound");
		
	
			// else
			if (serialized.get("EGenericType"+IdentificationResolver.getEGenericTypeId(obj.getEUpperBound())) == null) {
		     	webmapi.service.EGenericTypeSerializer.generateJSONObject(jw, obj.getEUpperBound(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getEGenericTypeId(obj.getEUpperBound()));
			}
  
	    jw.key("eTypeArguments");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EGenericType obji : obj.getETypeArguments()) {
				if (serialized.get("EGenericType"+IdentificationResolver.getEGenericTypeId(obji)) == null) {
					webmapi.service.EGenericTypeSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eRawType");
			List<org.eclipse.emf.ecore.EClass> eRawTypeEClass = new ArrayList<org.eclipse.emf.ecore.EClass>();
			List<org.eclipse.emf.ecore.EDataType> eRawTypeEDataType = new ArrayList<org.eclipse.emf.ecore.EDataType>();
			List<org.eclipse.emf.ecore.EEnum> eRawTypeEEnum = new ArrayList<org.eclipse.emf.ecore.EEnum>();
		if(obj.getERawType() != null){
			org.eclipse.emf.ecore.EClassifier element =obj.getERawType();
		    if(element instanceof org.eclipse.emf.ecore.EClass){
		    	eRawTypeEClass.add((org.eclipse.emf.ecore.EClass)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EEnum){
		    	eRawTypeEEnum.add((org.eclipse.emf.ecore.EEnum)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EDataType){
		    	eRawTypeEDataType.add((org.eclipse.emf.ecore.EDataType)element);
		    }
     	}		
		webmapi.service.container.EClassifierContainer eRawTypeContainer= new webmapi.service.container.EClassifierContainer(
eRawTypeEClass  
 
 , eRawTypeEDataType  
 
 , eRawTypeEEnum  
 
		);
    	webmapi.service.EClassifierContainerSerializer.generateJSONObject(jw, eRawTypeContainer, serialized, path, depth - 1);
  
	    jw.key("eLowerBound");
		
	
			// else
			if (serialized.get("EGenericType"+IdentificationResolver.getEGenericTypeId(obj.getELowerBound())) == null) {
		     	webmapi.service.EGenericTypeSerializer.generateJSONObject(jw, obj.getELowerBound(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getEGenericTypeId(obj.getELowerBound()));
			}
  
	    jw.key("eTypeParameter");
		
	
			// else
			if (serialized.get("ETypeParameter"+IdentificationResolver.getETypeParameterId(obj.getETypeParameter())) == null) {
		     	webmapi.service.ETypeParameterSerializer.generateJSONObject(jw, obj.getETypeParameter(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getETypeParameterId(obj.getETypeParameter()));
			}
  
	    jw.key("eClassifier");
			List<org.eclipse.emf.ecore.EClass> eClassifierEClass = new ArrayList<org.eclipse.emf.ecore.EClass>();
			List<org.eclipse.emf.ecore.EDataType> eClassifierEDataType = new ArrayList<org.eclipse.emf.ecore.EDataType>();
			List<org.eclipse.emf.ecore.EEnum> eClassifierEEnum = new ArrayList<org.eclipse.emf.ecore.EEnum>();
		if(obj.getEClassifier() != null){
			org.eclipse.emf.ecore.EClassifier element =obj.getEClassifier();
		    if(element instanceof org.eclipse.emf.ecore.EClass){
		    	eClassifierEClass.add((org.eclipse.emf.ecore.EClass)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EEnum){
		    	eClassifierEEnum.add((org.eclipse.emf.ecore.EEnum)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EDataType){
		    	eClassifierEDataType.add((org.eclipse.emf.ecore.EDataType)element);
		    }
     	}		
		webmapi.service.container.EClassifierContainer eClassifierContainer= new webmapi.service.container.EClassifierContainer(
eClassifierEClass  
 
 , eClassifierEDataType  
 
 , eClassifierEEnum  
 
		);
    	webmapi.service.EClassifierContainerSerializer.generateJSONObject(jw, eClassifierContainer, serialized, path, depth - 1);
  
		}
		jw.endObject();
	}

}

