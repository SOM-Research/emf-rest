
package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONWriter;

public final class EClassifierSerializer { 
 public static String serializeEClassifierList(java.util.List<org.eclipse.emf.ecore.EClassifier> obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (org.eclipse.emf.ecore.EClassifier oi : obj) {
            generateJSONObject(jw, (org.eclipse.emf.ecore.EClassifier)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize(org.eclipse.emf.ecore.EClassifier obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize(org.eclipse.emf.ecore.EClassifier obj, int depth, OutputStream out) {
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
	public final static void generateJSONObject(JSONWriter jw, org.eclipse.emf.ecore.EClassifier obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
		jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
		}
		// for each attribute
		  		jw.key("name").value(obj.getName());	
  						
		  		jw.key("instanceClassName").value(obj.getInstanceClassName());	
  						
		  		jw.key("instanceClass").value(obj.getInstanceClass());	
  						
		  		jw.key("defaultValue").value(obj.getDefaultValue());	
  						
		  		jw.key("instanceTypeName").value(obj.getInstanceTypeName());	
  						
 
		serialized.put("EClassifier"+IdentificationResolver.getEClassifierId(obj), "t");
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
  
	    jw.key("ePackage");
		
	
			// else
			if (serialized.get("EPackage"+IdentificationResolver.getEPackageId(obj.getEPackage())) == null) {
		     	webmapi.service.EPackageSerializer.generateJSONObject(jw, obj.getEPackage(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getEPackageId(obj.getEPackage()));
			}
  
	    jw.key("eTypeParameters");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.ETypeParameter obji : obj.getETypeParameters()) {
				if (serialized.get("ETypeParameter"+IdentificationResolver.getETypeParameterId(obji)) == null) {
					webmapi.service.ETypeParameterSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
		}
		jw.endObject();
	}

}

