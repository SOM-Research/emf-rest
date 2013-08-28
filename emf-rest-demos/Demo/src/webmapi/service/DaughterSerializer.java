
package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONWriter;

public final class DaughterSerializer { 
 public static String serializeDaughterList(java.util.List<Example.Daughter> obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (Example.Daughter oi : obj) {
            generateJSONObject(jw, (Example.Daughter)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize(Example.Daughter obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize(Example.Daughter obj, int depth, OutputStream out) {
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
	public final static void generateJSONObject(JSONWriter jw, Example.Daughter obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
		jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
		}
		  		jw.key("firstName").value(obj.getFirstName());	
  						
		  		jw.key("lastName").value(obj.getLastName());	
  						
 
		serialized.put("Daughter"+IdentificationResolver.getDaughterId(obj), "t");
		if (depth > 0) {
	    jw.key("family");
		
	
			// else
			if (serialized.get("Family"+IdentificationResolver.getFamilyId(obj.getFamily())) == null) {
		     	webmapi.service.FamilySerializer.generateJSONObject(jw, obj.getFamily(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getFamilyId(obj.getFamily()));
			}
  
		}
		jw.endObject();
	}

}

