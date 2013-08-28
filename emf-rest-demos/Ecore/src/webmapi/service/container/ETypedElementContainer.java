


package webmapi.service.container;

import java.util.List;

public class ETypedElementContainer {

	private List<org.eclipse.emf.ecore.EAttribute> eAttributeList;
	private List<org.eclipse.emf.ecore.EOperation> eOperationList;
	private List<org.eclipse.emf.ecore.EParameter> eParameterList;
	private List<org.eclipse.emf.ecore.EReference> eReferenceList;
	private List<org.eclipse.emf.ecore.EStructuralFeature> eStructuralFeatureList;

public ETypedElementContainer(){
}

public ETypedElementContainer(
List<org.eclipse.emf.ecore.EAttribute> eAttributeList  
 
 , List<org.eclipse.emf.ecore.EOperation> eOperationList  
 
 , List<org.eclipse.emf.ecore.EParameter> eParameterList  
 
 , List<org.eclipse.emf.ecore.EReference> eReferenceList  
 
 , List<org.eclipse.emf.ecore.EStructuralFeature> eStructuralFeatureList  
 
) {

	this.eAttributeList = eAttributeList;
	this.eOperationList = eOperationList;
	this.eParameterList = eParameterList;
	this.eReferenceList = eReferenceList;
	this.eStructuralFeatureList = eStructuralFeatureList;
}


public List<org.eclipse.emf.ecore.EAttribute> getEAttribute() {
    return eAttributeList;
}

public void setEAttribute(List<org.eclipse.emf.ecore.EAttribute> eAttributeList) {
    this.eAttributeList = eAttributeList;
}


public List<org.eclipse.emf.ecore.EOperation> getEOperation() {
    return eOperationList;
}

public void setEOperation(List<org.eclipse.emf.ecore.EOperation> eOperationList) {
    this.eOperationList = eOperationList;
}


public List<org.eclipse.emf.ecore.EParameter> getEParameter() {
    return eParameterList;
}

public void setEParameter(List<org.eclipse.emf.ecore.EParameter> eParameterList) {
    this.eParameterList = eParameterList;
}


public List<org.eclipse.emf.ecore.EReference> getEReference() {
    return eReferenceList;
}

public void setEReference(List<org.eclipse.emf.ecore.EReference> eReferenceList) {
    this.eReferenceList = eReferenceList;
}


public List<org.eclipse.emf.ecore.EStructuralFeature> getEStructuralFeature() {
    return eStructuralFeatureList;
}

public void setEStructuralFeature(List<org.eclipse.emf.ecore.EStructuralFeature> eStructuralFeatureList) {
    this.eStructuralFeatureList = eStructuralFeatureList;
}


}