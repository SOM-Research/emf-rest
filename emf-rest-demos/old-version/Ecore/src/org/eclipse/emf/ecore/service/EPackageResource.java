
package org.eclipse.emf.ecore.service;

import java.util.List;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class EPackageResource{

    private org.eclipse.emf.ecore.EPackage instance;
    
    public EPackageResource(org.eclipse.emf.ecore.EPackage instance){
    	this.instance = instance;
    }

	@GET
	public org.eclipse.emf.ecore.EPackage getEPackage(){
		return instance;
	}
		
	@PUT
	public void updateEPackage(org.eclipse.emf.ecore.EPackage object){
		
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
  
   @Path("eFactoryInstance")
   public org.eclipse.emf.ecore.service.EFactoryResource getResourceEFactoryInstance()
   {
      return new org.eclipse.emf.ecore.service.EFactoryResource(instance.getEFactoryInstance());
   }    
		 // REF eFactoryInstance
   @Path("eClassifiers")
   public org.eclipse.emf.ecore.service.CompoundEClassifierResource getResourceEClassifiers()
   {
      return new org.eclipse.emf.ecore.service.CompoundEClassifierResource(instance.getEClassifiers());   
   }  
     
   @Path("eSubpackages/{id}")
   public org.eclipse.emf.ecore.service.EPackageResource getResourceESubpackages
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EPackageResource(webmapi.service.IdentificationResolver.findEPackageById(instance.getESubpackages(),id));   
   }  
		 // REF eSubpackages
   @GET
   @Path("eSubpackages")
   public java.util.List<org.eclipse.emf.ecore.EPackage> getESubpackages(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getESubpackages();
     } else {
      return java.util.Collections.singletonList(instance.getESubpackages().get(index));
     }
          
   }
   @POST
   @Path("eSubpackages")
   public void addESubpackages
   (org.eclipse.emf.ecore.EPackage obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getESubpackages().add(obj);
   }
  
   @Path("eSuperPackage")
   public org.eclipse.emf.ecore.service.EPackageResource getResourceESuperPackage()
   {
      return new org.eclipse.emf.ecore.service.EPackageResource(instance.getESuperPackage());
   }    
		 // REF eSuperPackage
	
}

