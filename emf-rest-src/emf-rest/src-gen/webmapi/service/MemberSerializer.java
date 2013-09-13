
package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONWriter;

public final class MemberSerializer { 
 public static String serializeMemberList(java.util.List<Example.Member> obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (Example.Member oi : obj) {
            generateJSONObject(jw, (Example.Member)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize(Example.Member obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize(Example.Member obj, int depth, OutputStream out) {
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
	public final static void generateJSONObject(JSONWriter jw, Example.Member obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
		jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
		}
		  		jw.key("firstName").value(obj.getFirstName());	
  						
		  		jw.key("lastName").value(obj.getLastName());	
  						
 
		serialized.put("Member"+IdentificationResolver.getMemberId(obj), "t");
		if (depth > 0) {
		}
		jw.endObject();
	}

}

