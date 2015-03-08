
package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONWriter;

public final class EAnnotationSerializer { 
 public static String serializeEAnnotationList(java.util.List<org.eclipse.emf.ecore.EAnnotation> obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (org.eclipse.emf.ecore.EAnnotation oi : obj) {
            generateJSONObject(jw, (org.eclipse.emf.ecore.EAnnotation)oi, new HashMap<String, String>(), new StringBuffer(), depth);
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


	public final static String serialize(org.eclipse.emf.ecore.EAnnotation obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize(org.eclipse.emf.ecore.EAnnotation obj, int depth, OutputStream out) {
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
	public final static void generateJSONObject(JSONWriter jw, org.eclipse.emf.ecore.EAnnotation obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
		jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
		}
		// for each attribute
		  		jw.key("source").value(obj.getSource());	
  						
 
		serialized.put("EAnnotation"+IdentificationResolver.getEAnnotationId(obj), "t");
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
  
	    jw.key("details");
		
	
			jw.array();
			jw.endArray();
  
	    jw.key("eModelElement");
			List<org.eclipse.emf.ecore.EAttribute> eModelElementEAttribute = new ArrayList<org.eclipse.emf.ecore.EAttribute>();
			List<org.eclipse.emf.ecore.EAnnotation> eModelElementEAnnotation = new ArrayList<org.eclipse.emf.ecore.EAnnotation>();
			List<org.eclipse.emf.ecore.EClass> eModelElementEClass = new ArrayList<org.eclipse.emf.ecore.EClass>();
			List<org.eclipse.emf.ecore.EClassifier> eModelElementEClassifier = new ArrayList<org.eclipse.emf.ecore.EClassifier>();
			List<org.eclipse.emf.ecore.EDataType> eModelElementEDataType = new ArrayList<org.eclipse.emf.ecore.EDataType>();
			List<org.eclipse.emf.ecore.EEnum> eModelElementEEnum = new ArrayList<org.eclipse.emf.ecore.EEnum>();
			List<org.eclipse.emf.ecore.EEnumLiteral> eModelElementEEnumLiteral = new ArrayList<org.eclipse.emf.ecore.EEnumLiteral>();
			List<org.eclipse.emf.ecore.EFactory> eModelElementEFactory = new ArrayList<org.eclipse.emf.ecore.EFactory>();
			List<org.eclipse.emf.ecore.ENamedElement> eModelElementENamedElement = new ArrayList<org.eclipse.emf.ecore.ENamedElement>();
			List<org.eclipse.emf.ecore.EOperation> eModelElementEOperation = new ArrayList<org.eclipse.emf.ecore.EOperation>();
			List<org.eclipse.emf.ecore.EPackage> eModelElementEPackage = new ArrayList<org.eclipse.emf.ecore.EPackage>();
			List<org.eclipse.emf.ecore.EParameter> eModelElementEParameter = new ArrayList<org.eclipse.emf.ecore.EParameter>();
			List<org.eclipse.emf.ecore.EReference> eModelElementEReference = new ArrayList<org.eclipse.emf.ecore.EReference>();
			List<org.eclipse.emf.ecore.EStructuralFeature> eModelElementEStructuralFeature = new ArrayList<org.eclipse.emf.ecore.EStructuralFeature>();
			List<org.eclipse.emf.ecore.ETypedElement> eModelElementETypedElement = new ArrayList<org.eclipse.emf.ecore.ETypedElement>();
			List<org.eclipse.emf.ecore.ETypeParameter> eModelElementETypeParameter = new ArrayList<org.eclipse.emf.ecore.ETypeParameter>();
		if(obj.getEModelElement() != null){
			org.eclipse.emf.ecore.EModelElement element =obj.getEModelElement();
		    if(element instanceof org.eclipse.emf.ecore.EAttribute){
		    	eModelElementEAttribute.add((org.eclipse.emf.ecore.EAttribute)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EAnnotation){
		    	eModelElementEAnnotation.add((org.eclipse.emf.ecore.EAnnotation)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EClass){
		    	eModelElementEClass.add((org.eclipse.emf.ecore.EClass)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EEnum){
		    	eModelElementEEnum.add((org.eclipse.emf.ecore.EEnum)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EEnumLiteral){
		    	eModelElementEEnumLiteral.add((org.eclipse.emf.ecore.EEnumLiteral)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EFactory){
		    	eModelElementEFactory.add((org.eclipse.emf.ecore.EFactory)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EOperation){
		    	eModelElementEOperation.add((org.eclipse.emf.ecore.EOperation)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EPackage){
		    	eModelElementEPackage.add((org.eclipse.emf.ecore.EPackage)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EParameter){
		    	eModelElementEParameter.add((org.eclipse.emf.ecore.EParameter)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EReference){
		    	eModelElementEReference.add((org.eclipse.emf.ecore.EReference)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.ETypeParameter){
		    	eModelElementETypeParameter.add((org.eclipse.emf.ecore.ETypeParameter)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EDataType){
		    	eModelElementEDataType.add((org.eclipse.emf.ecore.EDataType)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EStructuralFeature){
		    	eModelElementEStructuralFeature.add((org.eclipse.emf.ecore.EStructuralFeature)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.EClassifier){
		    	eModelElementEClassifier.add((org.eclipse.emf.ecore.EClassifier)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.ETypedElement){
		    	eModelElementETypedElement.add((org.eclipse.emf.ecore.ETypedElement)element);
		    }
 else 		    if(element instanceof org.eclipse.emf.ecore.ENamedElement){
		    	eModelElementENamedElement.add((org.eclipse.emf.ecore.ENamedElement)element);
		    }
     	}		
		webmapi.service.container.EModelElementContainer eModelElementContainer= new webmapi.service.container.EModelElementContainer(
eModelElementEAttribute  
 
 , eModelElementEAnnotation  
 
 , eModelElementEClass  
 
 , eModelElementEClassifier  
 
 , eModelElementEDataType  
 
 , eModelElementEEnum  
 
 , eModelElementEEnumLiteral  
 
 , eModelElementEFactory  
 
 , eModelElementENamedElement  
 
 , eModelElementEOperation  
 
 , eModelElementEPackage  
 
 , eModelElementEParameter  
 
 , eModelElementEReference  
 
 , eModelElementEStructuralFeature  
 
 , eModelElementETypedElement  
 
 , eModelElementETypeParameter  
 
		);
    	webmapi.service.EModelElementContainerSerializer.generateJSONObject(jw, eModelElementContainer, serialized, path, depth - 1);
  
	    jw.key("contents");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EObject obji : obj.getContents()) {
				if (serialized.get("EObject"+IdentificationResolver.getEObjectId(obji)) == null) {
					webmapi.service.EObjectSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
	    jw.key("references");
		
	
			jw.array();
			for (org.eclipse.emf.ecore.EObject obji : obj.getReferences()) {
				if (serialized.get("EObject"+IdentificationResolver.getEObjectId(obji)) == null) {
					webmapi.service.EObjectSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
				}else{
					// put a reference???
				}
			}
			jw.endArray();
  
		}
		jw.endObject();
	}

}

