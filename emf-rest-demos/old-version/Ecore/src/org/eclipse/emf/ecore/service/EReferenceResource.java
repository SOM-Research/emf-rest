
package org.eclipse.emf.ecore.service;

import java.util.List;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class EReferenceResource{

    private org.eclipse.emf.ecore.EReference instance;
    
    public EReferenceResource(org.eclipse.emf.ecore.EReference instance){
    	this.instance = instance;
    }

	@GET
	public org.eclipse.emf.ecore.EReference getEReference(){
		return instance;
	}
		
	@PUT
	public void updateEReference(org.eclipse.emf.ecore.EReference object){
		
	}

   @Path("eAnnotations/{id}")
   public org.eclipse.emf.ecore.service.EAnnotationResource getResourceEAnnotations
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EAnnotationResource(webmapi.service.IdentificationResolver.findEAnnotationById(instance.getEAnnotations(),id));   
   }  
		 // REF eAnnotations
   @GET
   @Path("eAnnotations")
   public java.util.List<org.eclipse.emf.ecore.EAnnotation> getEAnnotations(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEAnnotations();
     } else {
      return java.util.Collections.singletonList(instance.getEAnnotations().get(index));
     }
          
   }
   @POST
   @Path("eAnnotations")
   public void addEAnnotations
   (org.eclipse.emf.ecore.EAnnotation obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getEAnnotations().add(obj);
   }
   @Path("eType")
   public org.eclipse.emf.ecore.service.CompoundEClassifierResource getResourceEType()
   {
      return new org.eclipse.emf.ecore.service.CompoundEClassifierResource(instance.getEType());   
   }  
     
  
   @Path("eGenericType")
   public org.eclipse.emf.ecore.service.EGenericTypeResource getResourceEGenericType()
   {
      return new org.eclipse.emf.ecore.service.EGenericTypeResource(instance.getEGenericType());
   }    
		 // REF eGenericType
  
   @Path("eContainingClass")
   public org.eclipse.emf.ecore.service.EClassResource getResourceEContainingClass()
   {
      return new org.eclipse.emf.ecore.service.EClassResource(instance.getEContainingClass());
   }    
		 // REF eContainingClass
  
   @Path("eOpposite")
   public org.eclipse.emf.ecore.service.EReferenceResource getResourceEOpposite()
   {
      return new org.eclipse.emf.ecore.service.EReferenceResource(instance.getEOpposite());
   }    
		 // REF eOpposite
  
   @Path("eReferenceType")
   public org.eclipse.emf.ecore.service.EClassResource getResourceEReferenceType()
   {
      return new org.eclipse.emf.ecore.service.EClassResource(instance.getEReferenceType());
   }    
		 // REF eReferenceType
   @Path("eKeys/{id}")
   public org.eclipse.emf.ecore.service.EAttributeResource getResourceEKeys
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EAttributeResource(webmapi.service.IdentificationResolver.findEAttributeById(instance.getEKeys(),id));   
   }  
		 // REF eKeys
   @GET
   @Path("eKeys")
   public java.util.List<org.eclipse.emf.ecore.EAttribute> getEKeys(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEKeys();
     } else {
      return java.util.Collections.singletonList(instance.getEKeys().get(index));
     }
          
   }
	
}

