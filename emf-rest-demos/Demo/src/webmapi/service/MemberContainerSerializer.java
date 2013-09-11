package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONWriter;

public final class MemberContainerSerializer { 
 public static String serializeMemberContainerList(java.util.List obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (Object oi : obj) {
            generateJSONObject(jw, ( webmapi.service.container.MemberContainer)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize( webmapi.service.container.MemberContainer obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize( webmapi.service.container.MemberContainer obj, int depth, OutputStream out) {
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
   public final static void generateJSONObject(JSONWriter jw, webmapi.service.container.MemberContainer obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
     jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
     }
     jw.key("Parent"); 
	 jw.array();
	 for (Example.Parent obji : obj.getParent()) {
		if (serialized.get("Parent"+IdentificationResolver.getParentId(obji)) == null) {
			webmapi.service.ParentSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
		}
	 }
	 jw.endArray();	 
     jw.key("Son"); 
	 jw.array();
	 for (Example.Son obji : obj.getSon()) {
		if (serialized.get("Son"+IdentificationResolver.getSonId(obji)) == null) {
			webmapi.service.SonSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
		}
	 }
	 jw.endArray();	 
     jw.key("Daughter"); 
	 jw.array();
	 for (Example.Daughter obji : obj.getDaughter()) {
		if (serialized.get("Daughter"+IdentificationResolver.getDaughterId(obji)) == null) {
			webmapi.service.DaughterSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
		}
	 }
	 jw.endArray();	 
     jw.endObject();
    }
 }
 
 
