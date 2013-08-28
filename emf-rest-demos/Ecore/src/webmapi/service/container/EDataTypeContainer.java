


package webmapi.service.container;

import java.util.List;

public class EDataTypeContainer {

	private List<org.eclipse.emf.ecore.EDataType> eDataTypeList;
	private List<org.eclipse.emf.ecore.EEnum> eEnumList;

public EDataTypeContainer(){
}

public EDataTypeContainer(
List<org.eclipse.emf.ecore.EDataType> eDataTypeList  
 
 , List<org.eclipse.emf.ecore.EEnum> eEnumList  
 
) {

	this.eDataTypeList = eDataTypeList;
	this.eEnumList = eEnumList;
}


public List<org.eclipse.emf.ecore.EDataType> getEDataType() {
    return eDataTypeList;
}

public void setEDataType(List<org.eclipse.emf.ecore.EDataType> eDataTypeList) {
    this.eDataTypeList = eDataTypeList;
}


public List<org.eclipse.emf.ecore.EEnum> getEEnum() {
    return eEnumList;
}

public void setEEnum(List<org.eclipse.emf.ecore.EEnum> eEnumList) {
    this.eEnumList = eEnumList;
}


}