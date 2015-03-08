
package org.eclipse.emf.ecore.service;

import java.util.ArrayList;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class CompoundEClassifierResource{

    private java.util.List<EClassifier> listInstance;
	private	java.util.List<org.eclipse.emf.ecore.EClass> eClassList = new ArrayList<org.eclipse.emf.ecore.EClass>();
	private	java.util.List<org.eclipse.emf.ecore.EDataType> eDataTypeList = new ArrayList<org.eclipse.emf.ecore.EDataType>();
	private	java.util.List<org.eclipse.emf.ecore.EEnum> eEnumList = new ArrayList<org.eclipse.emf.ecore.EEnum>();
	private webmapi.service.container.EClassifierContainer instance;
    
    public CompoundEClassifierResource(EClassifier instance){
        ArrayList list = new ArrayList();
        list.add(instance);
        initialize(list);
    }
    
    public CompoundEClassifierResource(java.util.List<EClassifier> listInstance){
         initialize(listInstance);
    }
    
    private void initialize(java.util.List<EClassifier> listInstance){
    	this.listInstance = listInstance;
		for(EClassifier element: listInstance){
		    if(element instanceof org.eclipse.emf.ecore.EClass){
		    	eClassList.add((org.eclipse.emf.ecore.EClass)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EEnum){
		    	eEnumList.add((org.eclipse.emf.ecore.EEnum)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EDataType){
		    	eDataTypeList.add((org.eclipse.emf.ecore.EDataType)element);
		    } 
     	}	
     	instance = new webmapi.service.container.EClassifierContainer(
eClassList  
 
 , eDataTypeList  
 
 , eEnumList  
 
		);	    	
    }

	@GET
	public webmapi.service.container.EClassifierContainer getEClassifierContainer(){
		return instance; 
	}
	
		
	@PUT
	public void updateEClassifier(EClassifier eClassifier){
		
	}

   @Path("EClass/{id}")
   public org.eclipse.emf.ecore.service.EClassResource getResourceEClass
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EClassResource(webmapi.service.IdentificationResolver.findEClassById(instance.getEClass(),id));   
   }  
   @GET
   @Path("EClass")
   public java.util.List<org.eclipse.emf.ecore.EClass> getEClass(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEClass();
     } else {
      return java.util.Collections.singletonList(instance.getEClass().get(index));
     }
          
   }
   @POST
   @Path("EClass")
   public void setEClass
   (EClass obj
   )
   {
     //TODO
   }
   @Path("EDataType/{id}")
   public org.eclipse.emf.ecore.service.EDataTypeResource getResourceEDataType
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EDataTypeResource(webmapi.service.IdentificationResolver.findEDataTypeById(instance.getEDataType(),id));   
   }  
   @GET
   @Path("EDataType")
   public java.util.List<org.eclipse.emf.ecore.EDataType> getEDataType(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEDataType();
     } else {
      return java.util.Collections.singletonList(instance.getEDataType().get(index));
     }
          
   }
   @POST
   @Path("EDataType")
   public void setEDataType
   (EDataType obj
   )
   {
     //TODO
   }
   @Path("EEnum/{id}")
   public org.eclipse.emf.ecore.service.EEnumResource getResourceEEnum
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EEnumResource(webmapi.service.IdentificationResolver.findEEnumById(instance.getEEnum(),id));   
   }  
   @GET
   @Path("EEnum")
   public java.util.List<org.eclipse.emf.ecore.EEnum> getEEnum(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEEnum();
     } else {
      return java.util.Collections.singletonList(instance.getEEnum().get(index));
     }
          
   }
   @POST
   @Path("EEnum")
   public void setEEnum
   (EEnum obj
   )
   {
     //TODO
   }
	
}

