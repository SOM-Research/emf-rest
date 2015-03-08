
package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONWriter;

public final class EParameterSerializer { 
 public static String serializeEParameterList(java.util.List<org.eclipse.emf.ecore.EParameter> obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (org.eclipse.emf.ecore.EParameter oi : obj) {
            generateJSONObject(jw, (org.eclipse.emf.ecore.EParameter)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize(org.eclipse.emf.ecore.EParameter obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize(org.eclipse.emf.ecore.EParameter obj, int depth, OutputStream out) {
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
	public final static void generateJSONObject(JSONWriter jw, org.eclipse.emf.ecore.EParameter obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
		jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
		}
		// for each attribute
		  		jw.key("name").value(obj.getName());	
  						
		  		jw.key("ordered").value(obj.isOrdered());	
  						
		  		jw.key("unique").value(obj.isUnique());	
  						
		  		jw.key("lowerBound").value(obj.getLowerBound());	
  						
		  		jw.key("upperBound").value(obj.getUpperBound());	
  						
		  		jw.key("many").value(obj.isMany());	
  						
		  		jw.key("required").value(obj.isRequired());	
  						
 
		serialized.put("EParameter"+IdentificationResolver.getEParameterId(obj), "t");
		if (depth > 0) {
	    jw.key("eAnnotations");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EAnnotation obji : obj.getEAnnotations()) {
				if (serialized.get("EAnnotation"+IdentificationResolver.getEAnnotationId(obji)) == null) {
					webmapi.service.EAnnotationSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eType");
			List<org.eclipse.emf.ecore.EClass> eTypeEClass = new ArrayList<org.eclipse.emf.ecore.EClass>();
			List<org.eclipse.emf.ecore.EDataType> eTypeEDataType = new ArrayList<org.eclipse.emf.ecore.EDataType>();
			List<org.eclipse.emf.ecore.EEnum> eTypeEEnum = new ArrayList<org.eclipse.emf.ecore.EEnum>();
		if(obj.getEType() != null){
			org.eclipse.emf.ecore.EClassifier element =obj.getEType();
		    if(element instanceof org.eclipse.emf.ecore.EClass){
		    	eTypeEClass.add((org.eclipse.emf.ecore.EClass)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EEnum){
		    	eTypeEEnum.add((org.eclipse.emf.ecore.EEnum)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EDataType){
		    	eTypeEDataType.add((org.eclipse.emf.ecore.EDataType)element);
		    }
     	}		
		webmapi.service.container.EClassifierContainer eTypeContainer= new webmapi.service.container.EClassifierContainer(
eTypeEClass  
 
 , eTypeEDataType  
 
 , eTypeEEnum  
 
		);
    	webmapi.service.EClassifierContainerSerializer.generateJSONObject(jw, eTypeContainer, serialized, path, depth - 1);
  
	    jw.key("eGenericType");
		
	
			// else
			if (serialized.get("EGenericType"+IdentificationResolver.getEGenericTypeId(obj.getEGenericType())) == null) {
		     	webmapi.service.EGenericTypeSerializer.generateJSONObject(jw, obj.getEGenericType(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getEGenericTypeId(obj.getEGenericType()));
			}
  
	    jw.key("eOperation");
		
	
			// else
			if (serialized.get("EOperation"+IdentificationResolver.getEOperationId(obj.getEOperation())) == null) {
		     	webmapi.service.EOperationSerializer.generateJSONObject(jw, obj.getEOperation(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getEOperationId(obj.getEOperation()));
			}
  
		}
		jw.endObject();
	}

}

