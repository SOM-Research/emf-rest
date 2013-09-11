package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONWriter;

public final class DogContainerSerializer { 
 public static String serializeDogContainerList(java.util.List obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (Object oi : obj) {
            generateJSONObject(jw, ( webmapi.service.container.DogContainer)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize( webmapi.service.container.DogContainer obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize( webmapi.service.container.DogContainer obj, int depth, OutputStream out) {
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
   public final static void generateJSONObject(JSONWriter jw, webmapi.service.container.DogContainer obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
     jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
     }
     jw.key("Dog"); 
	 jw.array();
	 for (Example.Dog obji : obj.getDog()) {
		if (serialized.get("Dog"+IdentificationResolver.getDogId(obji)) == null) {
			webmapi.service.DogSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
		}
	 }
	 jw.endArray();	 
     jw.key("RaceDog"); 
	 jw.array();
	 for (Example.RaceDog obji : obj.getRaceDog()) {
		if (serialized.get("RaceDog"+IdentificationResolver.getRaceDogId(obji)) == null) {
			webmapi.service.RaceDogSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
		}
	 }
	 jw.endArray();	 
     jw.key("HuntingDog"); 
	 jw.array();
	 for (Example.HuntingDog obji : obj.getHuntingDog()) {
		if (serialized.get("HuntingDog"+IdentificationResolver.getHuntingDogId(obji)) == null) {
			webmapi.service.HuntingDogSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
		}
	 }
	 jw.endArray();	 
     jw.endObject();
    }
 }
 
 
