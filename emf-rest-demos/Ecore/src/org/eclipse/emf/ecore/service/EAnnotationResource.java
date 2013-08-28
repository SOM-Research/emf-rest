
package org.eclipse.emf.ecore.service;

import java.util.List;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class EAnnotationResource{

    private org.eclipse.emf.ecore.EAnnotation instance;
    
    public EAnnotationResource(org.eclipse.emf.ecore.EAnnotation instance){
    	this.instance = instance;
    }

	@GET
	public org.eclipse.emf.ecore.EAnnotation getEAnnotation(){
		return instance;
	}
		
	@PUT
	public void updateEAnnotation(org.eclipse.emf.ecore.EAnnotation object){
		
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
   
   @Path("eModelElement")
   public org.eclipse.emf.ecore.service.CompoundEModelElementResource getResourceEModelElement()
   {
      return new org.eclipse.emf.ecore.service.CompoundEModelElementResource(instance.getEModelElement());   
   }  
     
   @Path("contents/{id}")
   public org.eclipse.emf.ecore.service.EObjectResource getResourceContents
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EObjectResource(webmapi.service.IdentificationResolver.findEObjectById(instance.getContents(),id));   
   }  
		 // REF contents
   @GET
   @Path("contents")
   public java.util.List<org.eclipse.emf.ecore.EObject> getContents(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getContents();
     } else {
      return java.util.Collections.singletonList(instance.getContents().get(index));
     }
          
   }
   @POST
   @Path("contents")
   public void addContents
   (org.eclipse.emf.ecore.EObject obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getContents().add(obj);
   }
   @Path("references/{id}")
   public org.eclipse.emf.ecore.service.EObjectResource getResourceReferences
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EObjectResource(webmapi.service.IdentificationResolver.findEObjectById(instance.getReferences(),id));   
   }  
		 // REF references
   @GET
   @Path("references")
   public java.util.List<org.eclipse.emf.ecore.EObject> getReferences(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getReferences();
     } else {
      return java.util.Collections.singletonList(instance.getReferences().get(index));
     }
          
   }
	
}

