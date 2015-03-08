
package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONWriter;

public final class EPackageSerializer { 
 public static String serializeEPackageList(java.util.List<org.eclipse.emf.ecore.EPackage> obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (org.eclipse.emf.ecore.EPackage oi : obj) {
            generateJSONObject(jw, (org.eclipse.emf.ecore.EPackage)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize(org.eclipse.emf.ecore.EPackage obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize(org.eclipse.emf.ecore.EPackage obj, int depth, OutputStream out) {
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
	public final static void generateJSONObject(JSONWriter jw, org.eclipse.emf.ecore.EPackage obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
		jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
		}
		// for each attribute
		  		jw.key("name").value(obj.getName());	
  						
		  		jw.key("nsURI").value(obj.getNsURI());	
  						
		  		jw.key("nsPrefix").value(obj.getNsPrefix());	
  						
 
		serialized.put("EPackage"+IdentificationResolver.getEPackageId(obj), "t");
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
  
	    jw.key("eFactoryInstance");
		
	
			// else
			if (serialized.get("EFactory"+IdentificationResolver.getEFactoryId(obj.getEFactoryInstance())) == null) {
		     	webmapi.service.EFactorySerializer.generateJSONObject(jw, obj.getEFactoryInstance(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getEFactoryId(obj.getEFactoryInstance()));
			}
  
	    jw.key("eClassifiers");
			List<org.eclipse.emf.ecore.EClass> eClassifiersEClass = new ArrayList<org.eclipse.emf.ecore.EClass>();
			List<org.eclipse.emf.ecore.EDataType> eClassifiersEDataType = new ArrayList<org.eclipse.emf.ecore.EDataType>();
			List<org.eclipse.emf.ecore.EEnum> eClassifiersEEnum = new ArrayList<org.eclipse.emf.ecore.EEnum>();
		for(org.eclipse.emf.ecore.EClassifier element: obj.getEClassifiers()){
		    if(element instanceof org.eclipse.emf.ecore.EClass){
		    	eClassifiersEClass.add((org.eclipse.emf.ecore.EClass)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EEnum){
		    	eClassifiersEEnum.add((org.eclipse.emf.ecore.EEnum)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EDataType){
		    	eClassifiersEDataType.add((org.eclipse.emf.ecore.EDataType)element);
		    }
     	}		
		webmapi.service.container.EClassifierContainer eClassifiersContainer= new webmapi.service.container.EClassifierContainer(
eClassifiersEClass  
 
 , eClassifiersEDataType  
 
 , eClassifiersEEnum  
 
		);
    	webmapi.service.EClassifierContainerSerializer.generateJSONObject(jw, eClassifiersContainer, serialized, path, depth - 1);
  
	    jw.key("eSubpackages");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EPackage obji : obj.getESubpackages()) {
				if (serialized.get("EPackage"+IdentificationResolver.getEPackageId(obji)) == null) {
					webmapi.service.EPackageSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eSuperPackage");
		
	
			// else
			if (serialized.get("EPackage"+IdentificationResolver.getEPackageId(obj.getESuperPackage())) == null) {
		     	webmapi.service.EPackageSerializer.generateJSONObject(jw, obj.getESuperPackage(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getEPackageId(obj.getESuperPackage()));
			}
  
		}
		jw.endObject();
	}

}

