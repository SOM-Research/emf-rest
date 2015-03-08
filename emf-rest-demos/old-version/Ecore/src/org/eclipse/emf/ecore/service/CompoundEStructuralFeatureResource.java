
package org.eclipse.emf.ecore.service;

import java.util.ArrayList;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class CompoundEStructuralFeatureResource{

    private java.util.List<EStructuralFeature> listInstance;
	private	java.util.List<org.eclipse.emf.ecore.EAttribute> eAttributeList = new ArrayList<org.eclipse.emf.ecore.EAttribute>();
	private	java.util.List<org.eclipse.emf.ecore.EReference> eReferenceList = new ArrayList<org.eclipse.emf.ecore.EReference>();
	private webmapi.service.container.EStructuralFeatureContainer instance;
    
    public CompoundEStructuralFeatureResource(EStructuralFeature instance){
        ArrayList list = new ArrayList();
        list.add(instance);
        initialize(list);
    }
    
    public CompoundEStructuralFeatureResource(java.util.List<EStructuralFeature> listInstance){
         initialize(listInstance);
    }
    
    private void initialize(java.util.List<EStructuralFeature> listInstance){
    	this.listInstance = listInstance;
		for(EStructuralFeature element: listInstance){
		    if(element instanceof org.eclipse.emf.ecore.EAttribute){
		    	eAttributeList.add((org.eclipse.emf.ecore.EAttribute)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EReference){
		    	eReferenceList.add((org.eclipse.emf.ecore.EReference)element);
		    } 
     	}	
     	instance = new webmapi.service.container.EStructuralFeatureContainer(
eAttributeList  
 
 , eReferenceList  
 
		);	    	
    }

	@GET
	public webmapi.service.container.EStructuralFeatureContainer getEStructuralFeatureContainer(){
		return instance; 
	}
	
		
	@PUT
	public void updateEStructuralFeature(EStructuralFeature eStructuralFeature){
		
	}

   @Path("EAttribute/{id}")
   public org.eclipse.emf.ecore.service.EAttributeResource getResourceEAttribute
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EAttributeResource(webmapi.service.IdentificationResolver.findEAttributeById(instance.getEAttribute(),id));   
   }  
   @GET
   @Path("EAttribute")
   public java.util.List<org.eclipse.emf.ecore.EAttribute> getEAttribute(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEAttribute();
     } else {
      return java.util.Collections.singletonList(instance.getEAttribute().get(index));
     }
          
   }
   @POST
   @Path("EAttribute")
   public void setEAttribute
   (EAttribute obj
   )
   {
     //TODO
   }
   @Path("EReference/{id}")
   public org.eclipse.emf.ecore.service.EReferenceResource getResourceEReference
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EReferenceResource(webmapi.service.IdentificationResolver.findEReferenceById(instance.getEReference(),id));   
   }  
   @GET
   @Path("EReference")
   public java.util.List<org.eclipse.emf.ecore.EReference> getEReference(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEReference();
     } else {
      return java.util.Collections.singletonList(instance.getEReference().get(index));
     }
          
   }
   @POST
   @Path("EReference")
   public void setEReference
   (EReference obj
   )
   {
     //TODO
   }
	
}

