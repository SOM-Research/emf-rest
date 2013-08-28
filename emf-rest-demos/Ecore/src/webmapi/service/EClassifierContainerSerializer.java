package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONWriter;

public final class EClassifierContainerSerializer { 
 public static String serializeEClassifierContainerList(java.util.List obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (Object oi : obj) {
            generateJSONObject(jw, ( webmapi.service.container.EClassifierContainer)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize( webmapi.service.container.EClassifierContainer obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize( webmapi.service.container.EClassifierContainer obj, int depth, OutputStream out) {
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
   public final static void generateJSONObject(JSONWriter jw, webmapi.service.container.EClassifierContainer obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
     jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
     }
     jw.key("EClass"); 
	 jw.array();
	 for (org.eclipse.emf.ecore.EClass obji : obj.getEClass()) {
		if (serialized.get("EClass"+IdentificationResolver.getEClassId(obji)) == null) {
			webmapi.service.EClassSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
			// put a reference???
		}
	 }
	 jw.endArray();	 
     jw.key("EDataType"); 
	 jw.array();
	 for (org.eclipse.emf.ecore.EDataType obji : obj.getEDataType()) {
		if (serialized.get("EDataType"+IdentificationResolver.getEDataTypeId(obji)) == null) {
			webmapi.service.EDataTypeSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
			// put a reference???
		}
	 }
	 jw.endArray();	 
     jw.key("EEnum"); 
	 jw.array();
	 for (org.eclipse.emf.ecore.EEnum obji : obj.getEEnum()) {
		if (serialized.get("EEnum"+IdentificationResolver.getEEnumId(obji)) == null) {
			webmapi.service.EEnumSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
			// put a reference???
		}
	 }
	 jw.endArray();	 
     jw.endObject();
    }
 }
 
 
