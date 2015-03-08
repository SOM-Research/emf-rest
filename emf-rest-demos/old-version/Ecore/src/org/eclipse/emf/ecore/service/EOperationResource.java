
package org.eclipse.emf.ecore.service;

import java.util.List;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class EOperationResource{

    private org.eclipse.emf.ecore.EOperation instance;
    
    public EOperationResource(org.eclipse.emf.ecore.EOperation instance){
    	this.instance = instance;
    }

	@GET
	public org.eclipse.emf.ecore.EOperation getEOperation(){
		return instance;
	}
		
	@PUT
	public void updateEOperation(org.eclipse.emf.ecore.EOperation object){
		
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
   @Path("eTypeParameters/{id}")
   public org.eclipse.emf.ecore.service.ETypeParameterResource getResourceETypeParameters
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.ETypeParameterResource(webmapi.service.IdentificationResolver.findETypeParameterById(instance.getETypeParameters(),id));   
   }  
		 // REF eTypeParameters
   @GET
   @Path("eTypeParameters")
   public java.util.List<org.eclipse.emf.ecore.ETypeParameter> getETypeParameters(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getETypeParameters();
     } else {
      return java.util.Collections.singletonList(instance.getETypeParameters().get(index));
     }
          
   }
   @POST
   @Path("eTypeParameters")
   public void addETypeParameters
   (org.eclipse.emf.ecore.ETypeParameter obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getETypeParameters().add(obj);
   }
   @Path("eParameters/{id}")
   public org.eclipse.emf.ecore.service.EParameterResource getResourceEParameters
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EParameterResource(webmapi.service.IdentificationResolver.findEParameterById(instance.getEParameters(),id));   
   }  
		 // REF eParameters
   @GET
   @Path("eParameters")
   public java.util.List<org.eclipse.emf.ecore.EParameter> getEParameters(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEParameters();
     } else {
      return java.util.Collections.singletonList(instance.getEParameters().get(index));
     }
          
   }
   @POST
   @Path("eParameters")
   public void addEParameters
   (org.eclipse.emf.ecore.EParameter obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getEParameters().add(obj);
   }
   @Path("eExceptions")
   public org.eclipse.emf.ecore.service.CompoundEClassifierResource getResourceEExceptions()
   {
      return new org.eclipse.emf.ecore.service.CompoundEClassifierResource(instance.getEExceptions());   
   }  
     
   @Path("eGenericExceptions/{id}")
   public org.eclipse.emf.ecore.service.EGenericTypeResource getResourceEGenericExceptions
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EGenericTypeResource(webmapi.service.IdentificationResolver.findEGenericTypeById(instance.getEGenericExceptions(),id));   
   }  
		 // REF eGenericExceptions
   @GET
   @Path("eGenericExceptions")
   public java.util.List<org.eclipse.emf.ecore.EGenericType> getEGenericExceptions(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEGenericExceptions();
     } else {
      return java.util.Collections.singletonList(instance.getEGenericExceptions().get(index));
     }
          
   }
   @POST
   @Path("eGenericExceptions")
   public void addEGenericExceptions
   (org.eclipse.emf.ecore.EGenericType obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getEGenericExceptions().add(obj);
   }
	
}

