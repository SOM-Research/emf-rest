
package org.eclipse.emf.ecore.service;

import java.util.List;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class EEnumLiteralResource{

    private org.eclipse.emf.ecore.EEnumLiteral instance;
    
    public EEnumLiteralResource(org.eclipse.emf.ecore.EEnumLiteral instance){
    	this.instance = instance;
    }

	@GET
	public org.eclipse.emf.ecore.EEnumLiteral getEEnumLiteral(){
		return instance;
	}
		
	@PUT
	public void updateEEnumLiteral(org.eclipse.emf.ecore.EEnumLiteral object){
		
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
  
   @Path("eEnum")
   public org.eclipse.emf.ecore.service.EEnumResource getResourceEEnum()
   {
      return new org.eclipse.emf.ecore.service.EEnumResource(instance.getEEnum());
   }    
		 // REF eEnum
	
}

