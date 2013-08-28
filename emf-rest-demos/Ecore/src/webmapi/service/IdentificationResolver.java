
package webmapi.service;

import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.ETypedElement;

public class IdentificationResolver {
	
 	public static String getEAttributeId(org.eclipse.emf.ecore.EAttribute obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEAnnotationId(org.eclipse.emf.ecore.EAnnotation obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getSource();
 	}
 	public static String getEClassId(org.eclipse.emf.ecore.EClass obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEClassifierId(org.eclipse.emf.ecore.EClassifier obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEDataTypeId(org.eclipse.emf.ecore.EDataType obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEEnumId(org.eclipse.emf.ecore.EEnum obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEEnumLiteralId(org.eclipse.emf.ecore.EEnumLiteral obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEFactoryId(org.eclipse.emf.ecore.EFactory obj){
 	    if(obj==null)
 	     return null;
 
	    return "";
 	}
 	public static String getEModelElementId(org.eclipse.emf.ecore.EModelElement obj){
 	    if(obj==null)
 	     return null;
 
	    return "";
 	}
 	public static String getENamedElementId(org.eclipse.emf.ecore.ENamedElement obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEObjectId(org.eclipse.emf.ecore.EObject obj){
 	    if(obj==null)
 	     return null;
 
	    return "";
 	}
 	public static String getEOperationId(org.eclipse.emf.ecore.EOperation obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEPackageId(org.eclipse.emf.ecore.EPackage obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEParameterId(org.eclipse.emf.ecore.EParameter obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEReferenceId(org.eclipse.emf.ecore.EReference obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEStructuralFeatureId(org.eclipse.emf.ecore.EStructuralFeature obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getETypedElementId(org.eclipse.emf.ecore.ETypedElement obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
 	public static String getEStringToStringMapEntryId(Map obj){
 	    if(obj==null)
 	     return null;
 
		return null;
 	}
 	public static String getEGenericTypeId(org.eclipse.emf.ecore.EGenericType obj){
 	    if(obj==null)
 	     return null;
 
	    return "";
 	}
 	public static String getETypeParameterId(org.eclipse.emf.ecore.ETypeParameter obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName();
 	}
	
 	public static org.eclipse.emf.ecore.EAttribute findEAttributeById(java.util.List<org.eclipse.emf.ecore.EAttribute> list, String id){
 	    for (EAttribute obji : list) {
			if (getEAttributeId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EAnnotation findEAnnotationById(java.util.List<org.eclipse.emf.ecore.EAnnotation> list, String id){
 	    for (EAnnotation obji : list) {
			if (getEAnnotationId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EClass findEClassById(java.util.List<org.eclipse.emf.ecore.EClass> list, String id){
 	    for (EClass obji : list) {
			if (getEClassId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EClassifier findEClassifierById(java.util.List<org.eclipse.emf.ecore.EClassifier> list, String id){
 	    for (EClassifier obji : list) {
			if (getEClassifierId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EDataType findEDataTypeById(java.util.List<org.eclipse.emf.ecore.EDataType> list, String id){
 	    for (EDataType obji : list) {
			if (getEDataTypeId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EEnum findEEnumById(java.util.List<org.eclipse.emf.ecore.EEnum> list, String id){
 	    for (EEnum obji : list) {
			if (getEEnumId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EEnumLiteral findEEnumLiteralById(java.util.List<org.eclipse.emf.ecore.EEnumLiteral> list, String id){
 	    for (EEnumLiteral obji : list) {
			if (getEEnumLiteralId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EFactory findEFactoryById(java.util.List<org.eclipse.emf.ecore.EFactory> list, String id){
 	    for (EFactory obji : list) {
			if (getEFactoryId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EModelElement findEModelElementById(java.util.List<org.eclipse.emf.ecore.EModelElement> list, String id){
 	    for (EModelElement obji : list) {
			if (getEModelElementId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.ENamedElement findENamedElementById(java.util.List<org.eclipse.emf.ecore.ENamedElement> list, String id){
 	    for (ENamedElement obji : list) {
			if (getENamedElementId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EObject findEObjectById(java.util.List<org.eclipse.emf.ecore.EObject> list, String id){
 	    for (EObject obji : list) {
			if (getEObjectId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EOperation findEOperationById(java.util.List<org.eclipse.emf.ecore.EOperation> list, String id){
 	    for (EOperation obji : list) {
			if (getEOperationId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EPackage findEPackageById(java.util.List<org.eclipse.emf.ecore.EPackage> list, String id){
 	    for (EPackage obji : list) {
			if (getEPackageId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EParameter findEParameterById(java.util.List<org.eclipse.emf.ecore.EParameter> list, String id){
 	    for (EParameter obji : list) {
			if (getEParameterId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EReference findEReferenceById(java.util.List<org.eclipse.emf.ecore.EReference> list, String id){
 	    for (EReference obji : list) {
			if (getEReferenceId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EStructuralFeature findEStructuralFeatureById(java.util.List<org.eclipse.emf.ecore.EStructuralFeature> list, String id){
 	    for (EStructuralFeature obji : list) {
			if (getEStructuralFeatureId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.ETypedElement findETypedElementById(java.util.List<org.eclipse.emf.ecore.ETypedElement> list, String id){
 	    for (ETypedElement obji : list) {
			if (getETypedElementId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static Map findEStringToStringMapEntryById(java.util.List list, String id){
		return null;
	}
	
 	public static org.eclipse.emf.ecore.EGenericType findEGenericTypeById(java.util.List<org.eclipse.emf.ecore.EGenericType> list, String id){
 	    for (EGenericType obji : list) {
			if (getEGenericTypeId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static org.eclipse.emf.ecore.ETypeParameter findETypeParameterById(java.util.List<org.eclipse.emf.ecore.ETypeParameter> list, String id){
 	    for (ETypeParameter obji : list) {
			if (getETypeParameterId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
	
}
