
package org.eclipse.emf.ecore.service;

import java.util.ArrayList;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class CompoundETypedElementResource{

    private java.util.List<ETypedElement> listInstance;
	private	java.util.List<org.eclipse.emf.ecore.EAttribute> eAttributeList = new ArrayList<org.eclipse.emf.ecore.EAttribute>();
	private	java.util.List<org.eclipse.emf.ecore.EOperation> eOperationList = new ArrayList<org.eclipse.emf.ecore.EOperation>();
	private	java.util.List<org.eclipse.emf.ecore.EParameter> eParameterList = new ArrayList<org.eclipse.emf.ecore.EParameter>();
	private	java.util.List<org.eclipse.emf.ecore.EReference> eReferenceList = new ArrayList<org.eclipse.emf.ecore.EReference>();
	private	java.util.List<org.eclipse.emf.ecore.EStructuralFeature> eStructuralFeatureList = new ArrayList<org.eclipse.emf.ecore.EStructuralFeature>();
	private webmapi.service.container.ETypedElementContainer instance;
    
    public CompoundETypedElementResource(ETypedElement instance){
        ArrayList list = new ArrayList();
        list.add(instance);
        initialize(list);
    }
    
    public CompoundETypedElementResource(java.util.List<ETypedElement> listInstance){
         initialize(listInstance);
    }
    
    private void initialize(java.util.List<ETypedElement> listInstance){
    	this.listInstance = listInstance;
		for(ETypedElement element: listInstance){
		    if(element instanceof org.eclipse.emf.ecore.EAttribute){
		    	eAttributeList.add((org.eclipse.emf.ecore.EAttribute)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EOperation){
		    	eOperationList.add((org.eclipse.emf.ecore.EOperation)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EParameter){
		    	eParameterList.add((org.eclipse.emf.ecore.EParameter)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EReference){
		    	eReferenceList.add((org.eclipse.emf.ecore.EReference)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EStructuralFeature){
		    	eStructuralFeatureList.add((org.eclipse.emf.ecore.EStructuralFeature)element);
		    } 
     	}	
     	instance = new webmapi.service.container.ETypedElementContainer(
eAttributeList  
 
 , eOperationList  
 
 , eParameterList  
 
 , eReferenceList  
 
 , eStructuralFeatureList  
 
		);	    	
    }

	@GET
	public webmapi.service.container.ETypedElementContainer getETypedElementContainer(){
		return instance; 
	}
	
		
	@PUT
	public void updateETypedElement(ETypedElement eTypedElement){
		
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
   @Path("EOperation/{id}")
   public org.eclipse.emf.ecore.service.EOperationResource getResourceEOperation
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EOperationResource(webmapi.service.IdentificationResolver.findEOperationById(instance.getEOperation(),id));   
   }  
   @GET
   @Path("EOperation")
   public java.util.List<org.eclipse.emf.ecore.EOperation> getEOperation(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEOperation();
     } else {
      return java.util.Collections.singletonList(instance.getEOperation().get(index));
     }
          
   }
   @POST
   @Path("EOperation")
   public void setEOperation
   (EOperation obj
   )
   {
     //TODO
   }
   @Path("EParameter/{id}")
   public org.eclipse.emf.ecore.service.EParameterResource getResourceEParameter
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EParameterResource(webmapi.service.IdentificationResolver.findEParameterById(instance.getEParameter(),id));   
   }  
   @GET
   @Path("EParameter")
   public java.util.List<org.eclipse.emf.ecore.EParameter> getEParameter(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEParameter();
     } else {
      return java.util.Collections.singletonList(instance.getEParameter().get(index));
     }
          
   }
   @POST
   @Path("EParameter")
   public void setEParameter
   (EParameter obj
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
   @Path("EStructuralFeature/{id}")
   public org.eclipse.emf.ecore.service.EStructuralFeatureResource getResourceEStructuralFeature
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EStructuralFeatureResource(webmapi.service.IdentificationResolver.findEStructuralFeatureById(instance.getEStructuralFeature(),id));   
   }  
   @GET
   @Path("EStructuralFeature")
   public java.util.List<org.eclipse.emf.ecore.EStructuralFeature> getEStructuralFeature(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEStructuralFeature();
     } else {
      return java.util.Collections.singletonList(instance.getEStructuralFeature().get(index));
     }
          
   }
   @POST
   @Path("EStructuralFeature")
   public void setEStructuralFeature
   (EStructuralFeature obj
   )
   {
     //TODO
   }
	
}

