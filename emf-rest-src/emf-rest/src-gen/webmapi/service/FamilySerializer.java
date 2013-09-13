
package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONWriter;

public final class FamilySerializer { 
 public static String serializeFamilyList(java.util.List<Example.Family> obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (Example.Family oi : obj) {
            generateJSONObject(jw, (Example.Family)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize(Example.Family obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize(Example.Family obj, int depth, OutputStream out) {
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
	public final static void generateJSONObject(JSONWriter jw, Example.Family obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
		jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
		}
		  		jw.key("address").value(obj.getAddress());	
  						
 
		serialized.put("Family"+IdentificationResolver.getFamilyId(obj), "t");
		if (depth > 0) {
	    jw.key("parents");
		
	
			jw.array();
			for (Example.Parent obji : obj.getParents()) {
				if (serialized.get("Parent"+IdentificationResolver.getParentId(obji)) == null) {
					webmapi.service.ParentSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
				}
			}
			jw.endArray();
  
	    jw.key("sons");
		
	
			jw.array();
			for (Example.Son obji : obj.getSons()) {
				if (serialized.get("Son"+IdentificationResolver.getSonId(obji)) == null) {
					webmapi.service.SonSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
				}
			}
			jw.endArray();
  
	    jw.key("daughters");
		
	
			jw.array();
			for (Example.Daughter obji : obj.getDaughters()) {
				if (serialized.get("Daughter"+IdentificationResolver.getDaughterId(obji)) == null) {
					webmapi.service.DaughterSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
				}
			}
			jw.endArray();
  
	    jw.key("pets");
			List<Example.Dog> petsDog = new ArrayList<Example.Dog>();
			List<Example.Cat> petsCat = new ArrayList<Example.Cat>();
			List<Example.RaceDog> petsRaceDog = new ArrayList<Example.RaceDog>();
			List<Example.HuntingDog> petsHuntingDog = new ArrayList<Example.HuntingDog>();
		for(Example.Pet element: obj.getPets()){
		    if(element instanceof Example.Cat){
		    	petsCat.add((Example.Cat)element);
		    }
 else 		    if(element instanceof Example.RaceDog){
		    	petsRaceDog.add((Example.RaceDog)element);
		    }
 else 		    if(element instanceof Example.HuntingDog){
		    	petsHuntingDog.add((Example.HuntingDog)element);
		    }
 else 		    if(element instanceof Example.Dog){
		    	petsDog.add((Example.Dog)element);
		    }
     	}		
		webmapi.service.container.PetContainer petsContainer= new webmapi.service.container.PetContainer(
petsDog  
 
 , petsCat  
 
 , petsRaceDog  
 
 , petsHuntingDog  
 
		);
    	webmapi.service.PetContainerSerializer.generateJSONObject(jw, petsContainer, serialized, path, depth - 1);
  
		}
		jw.endObject();
	}

}

