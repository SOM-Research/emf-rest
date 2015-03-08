


package webmapi.service.container;

import java.util.List;

public class EStructuralFeatureContainer {

	private List<org.eclipse.emf.ecore.EAttribute> eAttributeList;
	private List<org.eclipse.emf.ecore.EReference> eReferenceList;

public EStructuralFeatureContainer(){
}

public EStructuralFeatureContainer(
List<org.eclipse.emf.ecore.EAttribute> eAttributeList  
 
 , List<org.eclipse.emf.ecore.EReference> eReferenceList  
 
) {

	this.eAttributeList = eAttributeList;
	this.eReferenceList = eReferenceList;
}


public List<org.eclipse.emf.ecore.EAttribute> getEAttribute() {
    return eAttributeList;
}

public void setEAttribute(List<org.eclipse.emf.ecore.EAttribute> eAttributeList) {
    this.eAttributeList = eAttributeList;
}


public List<org.eclipse.emf.ecore.EReference> getEReference() {
    return eReferenceList;
}

public void setEReference(List<org.eclipse.emf.ecore.EReference> eReferenceList) {
    this.eReferenceList = eReferenceList;
}


}