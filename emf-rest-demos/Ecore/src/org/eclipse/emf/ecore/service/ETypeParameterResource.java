
package org.eclipse.emf.ecore.service;

import java.util.List;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class ETypeParameterResource{

    private org.eclipse.emf.ecore.ETypeParameter instance;
    
    public ETypeParameterResource(org.eclipse.emf.ecore.ETypeParameter instance){
    	this.instance = instance;
    }

	@GET
	public org.eclipse.emf.ecore.ETypeParameter getETypeParameter(){
		return instance;
	}
		
	@PUT
	public void updateETypeParameter(org.eclipse.emf.ecore.ETypeParameter object){
		
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
   @Path("eBounds/{id}")
   public org.eclipse.emf.ecore.service.EGenericTypeResource getResourceEBounds
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EGenericTypeResource(webmapi.service.IdentificationResolver.findEGenericTypeById(instance.getEBounds(),id));   
   }  
		 // REF eBounds
   @GET
   @Path("eBounds")
   public java.util.List<org.eclipse.emf.ecore.EGenericType> getEBounds(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEBounds();
     } else {
      return java.util.Collections.singletonList(instance.getEBounds().get(index));
     }
          
   }
   @POST
   @Path("eBounds")
   public void addEBounds
   (org.eclipse.emf.ecore.EGenericType obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getEBounds().add(obj);
   }
	
}

