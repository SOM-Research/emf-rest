
package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONWriter;

public final class EEnumLiteralSerializer { 
 public static String serializeEEnumLiteralList(java.util.List<org.eclipse.emf.ecore.EEnumLiteral> obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (org.eclipse.emf.ecore.EEnumLiteral oi : obj) {
            generateJSONObject(jw, (org.eclipse.emf.ecore.EEnumLiteral)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize(org.eclipse.emf.ecore.EEnumLiteral obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize(org.eclipse.emf.ecore.EEnumLiteral obj, int depth, OutputStream out) {
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
	public final static void generateJSONObject(JSONWriter jw, org.eclipse.emf.ecore.EEnumLiteral obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
		jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
		}
		// for each attribute
		  		jw.key("name").value(obj.getName());	
  						
		  		jw.key("value").value(obj.getValue());	
  						
		  		jw.key("instance").value(obj.getInstance());	
  						
		  		jw.key("literal").value(obj.getLiteral());	
  						
 
		serialized.put("EEnumLiteral"+IdentificationResolver.getEEnumLiteralId(obj), "t");
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
  
	    jw.key("eEnum");
		
	
			// else
			if (serialized.get("EEnum"+IdentificationResolver.getEEnumId(obj.getEEnum())) == null) {
		     	webmapi.service.EEnumSerializer.generateJSONObject(jw, obj.getEEnum(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getEEnumId(obj.getEEnum()));
			}
  
		}
		jw.endObject();
	}

}

