
package org.eclipse.emf.ecore.service;

import java.util.List;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class EStructuralFeatureResource{

    private org.eclipse.emf.ecore.EStructuralFeature instance;
    
    public EStructuralFeatureResource(org.eclipse.emf.ecore.EStructuralFeature instance){
    	this.instance = instance;
    }

	@GET
	public org.eclipse.emf.ecore.EStructuralFeature getEStructuralFeature(){
		return instance;
	}
		
	@PUT
	public void updateEStructuralFeature(org.eclipse.emf.ecore.EStructuralFeature object){
		
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
	
}

