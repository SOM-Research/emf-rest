
package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONWriter;

public final class EClassSerializer { 
 public static String serializeEClassList(java.util.List<org.eclipse.emf.ecore.EClass> obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (org.eclipse.emf.ecore.EClass oi : obj) {
            generateJSONObject(jw, (org.eclipse.emf.ecore.EClass)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize(org.eclipse.emf.ecore.EClass obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize(org.eclipse.emf.ecore.EClass obj, int depth, OutputStream out) {
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
	public final static void generateJSONObject(JSONWriter jw, org.eclipse.emf.ecore.EClass obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
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
  						
		  		jw.key("abstract").value(obj.isAbstract());	
  						
		  		jw.key("interface").value(obj.isInterface());	
  						
 
		serialized.put("EClass"+IdentificationResolver.getEClassId(obj), "t");
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
  
	    jw.key("eSuperTypes");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EClass obji : obj.getESuperTypes()) {
				if (serialized.get("EClass"+IdentificationResolver.getEClassId(obji)) == null) {
					webmapi.service.EClassSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eOperations");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EOperation obji : obj.getEOperations()) {
				if (serialized.get("EOperation"+IdentificationResolver.getEOperationId(obji)) == null) {
					webmapi.service.EOperationSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eAllAttributes");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EAttribute obji : obj.getEAllAttributes()) {
				if (serialized.get("EAttribute"+IdentificationResolver.getEAttributeId(obji)) == null) {
					webmapi.service.EAttributeSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eAllReferences");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EReference obji : obj.getEAllReferences()) {
				if (serialized.get("EReference"+IdentificationResolver.getEReferenceId(obji)) == null) {
					webmapi.service.EReferenceSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eReferences");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EReference obji : obj.getEReferences()) {
				if (serialized.get("EReference"+IdentificationResolver.getEReferenceId(obji)) == null) {
					webmapi.service.EReferenceSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eAttributes");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EAttribute obji : obj.getEAttributes()) {
				if (serialized.get("EAttribute"+IdentificationResolver.getEAttributeId(obji)) == null) {
					webmapi.service.EAttributeSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eAllContainments");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EReference obji : obj.getEAllContainments()) {
				if (serialized.get("EReference"+IdentificationResolver.getEReferenceId(obji)) == null) {
					webmapi.service.EReferenceSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eAllOperations");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EOperation obji : obj.getEAllOperations()) {
				if (serialized.get("EOperation"+IdentificationResolver.getEOperationId(obji)) == null) {
					webmapi.service.EOperationSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eAllStructuralFeatures");
			List<org.eclipse.emf.ecore.EAttribute> eAllStructuralFeaturesEAttribute = new ArrayList<org.eclipse.emf.ecore.EAttribute>();
			List<org.eclipse.emf.ecore.EReference> eAllStructuralFeaturesEReference = new ArrayList<org.eclipse.emf.ecore.EReference>();
		for(org.eclipse.emf.ecore.EStructuralFeature element: obj.getEAllStructuralFeatures()){
		    if(element instanceof org.eclipse.emf.ecore.EAttribute){
		    	eAllStructuralFeaturesEAttribute.add((org.eclipse.emf.ecore.EAttribute)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EReference){
		    	eAllStructuralFeaturesEReference.add((org.eclipse.emf.ecore.EReference)element);
		    }
     	}		
		webmapi.service.container.EStructuralFeatureContainer eAllStructuralFeaturesContainer= new webmapi.service.container.EStructuralFeatureContainer(
eAllStructuralFeaturesEAttribute  
 
 , eAllStructuralFeaturesEReference  
 
		);
    	webmapi.service.EStructuralFeatureContainerSerializer.generateJSONObject(jw, eAllStructuralFeaturesContainer, serialized, path, depth - 1);
  
	    jw.key("eAllSuperTypes");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EClass obji : obj.getEAllSuperTypes()) {
				if (serialized.get("EClass"+IdentificationResolver.getEClassId(obji)) == null) {
					webmapi.service.EClassSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eIDAttribute");
		
	
			// else
			if (serialized.get("EAttribute"+IdentificationResolver.getEAttributeId(obj.getEIDAttribute())) == null) {
		     	webmapi.service.EAttributeSerializer.generateJSONObject(jw, obj.getEIDAttribute(), serialized, path, depth - 1);
			}else{
			    jw.value(IdentificationResolver.getEAttributeId(obj.getEIDAttribute()));
			}
  
	    jw.key("eStructuralFeatures");
			List<org.eclipse.emf.ecore.EAttribute> eStructuralFeaturesEAttribute = new ArrayList<org.eclipse.emf.ecore.EAttribute>();
			List<org.eclipse.emf.ecore.EReference> eStructuralFeaturesEReference = new ArrayList<org.eclipse.emf.ecore.EReference>();
		for(org.eclipse.emf.ecore.EStructuralFeature element: obj.getEStructuralFeatures()){
		    if(element instanceof org.eclipse.emf.ecore.EAttribute){
		    	eStructuralFeaturesEAttribute.add((org.eclipse.emf.ecore.EAttribute)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EReference){
		    	eStructuralFeaturesEReference.add((org.eclipse.emf.ecore.EReference)element);
		    }
     	}		
		webmapi.service.container.EStructuralFeatureContainer eStructuralFeaturesContainer= new webmapi.service.container.EStructuralFeatureContainer(
eStructuralFeaturesEAttribute  
 
 , eStructuralFeaturesEReference  
 
		);
    	webmapi.service.EStructuralFeatureContainerSerializer.generateJSONObject(jw, eStructuralFeaturesContainer, serialized, path, depth - 1);
  
	    jw.key("eGenericSuperTypes");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EGenericType obji : obj.getEGenericSuperTypes()) {
				if (serialized.get("EGenericType"+IdentificationResolver.getEGenericTypeId(obji)) == null) {
					webmapi.service.EGenericTypeSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("eAllGenericSuperTypes");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EGenericType obji : obj.getEAllGenericSuperTypes()) {
				if (serialized.get("EGenericType"+IdentificationResolver.getEGenericTypeId(obji)) == null) {
					webmapi.service.EGenericTypeSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
		}
		jw.endObject();
	}

}

