
package org.eclipse.emf.ecore.service;

import java.util.List;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class EClassResource{

    private org.eclipse.emf.ecore.EClass instance;
    
    public EClassResource(org.eclipse.emf.ecore.EClass instance){
    	this.instance = instance;
    }

	@GET
	public org.eclipse.emf.ecore.EClass getEClass(){
		return instance;
	}
		
	@PUT
	public void updateEClass(org.eclipse.emf.ecore.EClass object){
		
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
  
   @Path("ePackage")
   public org.eclipse.emf.ecore.service.EPackageResource getResourceEPackage()
   {
      return new org.eclipse.emf.ecore.service.EPackageResource(instance.getEPackage());
   }    
		 // REF ePackage
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
   @Path("eSuperTypes/{id}")
   public org.eclipse.emf.ecore.service.EClassResource getResourceESuperTypes
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EClassResource(webmapi.service.IdentificationResolver.findEClassById(instance.getESuperTypes(),id));   
   }  
		 // REF eSuperTypes
   @GET
   @Path("eSuperTypes")
   public java.util.List<org.eclipse.emf.ecore.EClass> getESuperTypes(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getESuperTypes();
     } else {
      return java.util.Collections.singletonList(instance.getESuperTypes().get(index));
     }
          
   }
   @Path("eOperations/{id}")
   public org.eclipse.emf.ecore.service.EOperationResource getResourceEOperations
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EOperationResource(webmapi.service.IdentificationResolver.findEOperationById(instance.getEOperations(),id));   
   }  
		 // REF eOperations
   @GET
   @Path("eOperations")
   public java.util.List<org.eclipse.emf.ecore.EOperation> getEOperations(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEOperations();
     } else {
      return java.util.Collections.singletonList(instance.getEOperations().get(index));
     }
          
   }
   @POST
   @Path("eOperations")
   public void addEOperations
   (org.eclipse.emf.ecore.EOperation obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getEOperations().add(obj);
   }
   @Path("eAllAttributes/{id}")
   public org.eclipse.emf.ecore.service.EAttributeResource getResourceEAllAttributes
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EAttributeResource(webmapi.service.IdentificationResolver.findEAttributeById(instance.getEAllAttributes(),id));   
   }  
		 // REF eAllAttributes
   @GET
   @Path("eAllAttributes")
   public java.util.List<org.eclipse.emf.ecore.EAttribute> getEAllAttributes(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEAllAttributes();
     } else {
      return java.util.Collections.singletonList(instance.getEAllAttributes().get(index));
     }
          
   }
   @Path("eAllReferences/{id}")
   public org.eclipse.emf.ecore.service.EReferenceResource getResourceEAllReferences
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EReferenceResource(webmapi.service.IdentificationResolver.findEReferenceById(instance.getEAllReferences(),id));   
   }  
		 // REF eAllReferences
   @GET
   @Path("eAllReferences")
   public java.util.List<org.eclipse.emf.ecore.EReference> getEAllReferences(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEAllReferences();
     } else {
      return java.util.Collections.singletonList(instance.getEAllReferences().get(index));
     }
          
   }
   @Path("eReferences/{id}")
   public org.eclipse.emf.ecore.service.EReferenceResource getResourceEReferences
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EReferenceResource(webmapi.service.IdentificationResolver.findEReferenceById(instance.getEReferences(),id));   
   }  
		 // REF eReferences
   @GET
   @Path("eReferences")
   public java.util.List<org.eclipse.emf.ecore.EReference> getEReferences(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEReferences();
     } else {
      return java.util.Collections.singletonList(instance.getEReferences().get(index));
     }
          
   }
   @Path("eAttributes/{id}")
   public org.eclipse.emf.ecore.service.EAttributeResource getResourceEAttributes
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EAttributeResource(webmapi.service.IdentificationResolver.findEAttributeById(instance.getEAttributes(),id));   
   }  
		 // REF eAttributes
   @GET
   @Path("eAttributes")
   public java.util.List<org.eclipse.emf.ecore.EAttribute> getEAttributes(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEAttributes();
     } else {
      return java.util.Collections.singletonList(instance.getEAttributes().get(index));
     }
          
   }
   @Path("eAllContainments/{id}")
   public org.eclipse.emf.ecore.service.EReferenceResource getResourceEAllContainments
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EReferenceResource(webmapi.service.IdentificationResolver.findEReferenceById(instance.getEAllContainments(),id));   
   }  
		 // REF eAllContainments
   @GET
   @Path("eAllContainments")
   public java.util.List<org.eclipse.emf.ecore.EReference> getEAllContainments(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEAllContainments();
     } else {
      return java.util.Collections.singletonList(instance.getEAllContainments().get(index));
     }
          
   }
   @Path("eAllOperations/{id}")
   public org.eclipse.emf.ecore.service.EOperationResource getResourceEAllOperations
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EOperationResource(webmapi.service.IdentificationResolver.findEOperationById(instance.getEAllOperations(),id));   
   }  
		 // REF eAllOperations
   @GET
   @Path("eAllOperations")
   public java.util.List<org.eclipse.emf.ecore.EOperation> getEAllOperations(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEAllOperations();
     } else {
      return java.util.Collections.singletonList(instance.getEAllOperations().get(index));
     }
          
   }
   @Path("eAllStructuralFeatures")
   public org.eclipse.emf.ecore.service.CompoundEStructuralFeatureResource getResourceEAllStructuralFeatures()
   {
      return new org.eclipse.emf.ecore.service.CompoundEStructuralFeatureResource(instance.getEAllStructuralFeatures());   
   }  
     
   @Path("eAllSuperTypes/{id}")
   public org.eclipse.emf.ecore.service.EClassResource getResourceEAllSuperTypes
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EClassResource(webmapi.service.IdentificationResolver.findEClassById(instance.getEAllSuperTypes(),id));   
   }  
		 // REF eAllSuperTypes
   @GET
   @Path("eAllSuperTypes")
   public java.util.List<org.eclipse.emf.ecore.EClass> getEAllSuperTypes(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEAllSuperTypes();
     } else {
      return java.util.Collections.singletonList(instance.getEAllSuperTypes().get(index));
     }
          
   }
  
   @Path("eIDAttribute")
   public org.eclipse.emf.ecore.service.EAttributeResource getResourceEIDAttribute()
   {
      return new org.eclipse.emf.ecore.service.EAttributeResource(instance.getEIDAttribute());
   }    
		 // REF eIDAttribute
   @Path("eStructuralFeatures")
   public org.eclipse.emf.ecore.service.CompoundEStructuralFeatureResource getResourceEStructuralFeatures()
   {
      return new org.eclipse.emf.ecore.service.CompoundEStructuralFeatureResource(instance.getEStructuralFeatures());   
   }  
     
   @Path("eGenericSuperTypes/{id}")
   public org.eclipse.emf.ecore.service.EGenericTypeResource getResourceEGenericSuperTypes
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EGenericTypeResource(webmapi.service.IdentificationResolver.findEGenericTypeById(instance.getEGenericSuperTypes(),id));   
   }  
		 // REF eGenericSuperTypes
   @GET
   @Path("eGenericSuperTypes")
   public java.util.List<org.eclipse.emf.ecore.EGenericType> getEGenericSuperTypes(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEGenericSuperTypes();
     } else {
      return java.util.Collections.singletonList(instance.getEGenericSuperTypes().get(index));
     }
          
   }
   @POST
   @Path("eGenericSuperTypes")
   public void addEGenericSuperTypes
   (org.eclipse.emf.ecore.EGenericType obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getEGenericSuperTypes().add(obj);
   }
   @Path("eAllGenericSuperTypes/{id}")
   public org.eclipse.emf.ecore.service.EGenericTypeResource getResourceEAllGenericSuperTypes
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EGenericTypeResource(webmapi.service.IdentificationResolver.findEGenericTypeById(instance.getEAllGenericSuperTypes(),id));   
   }  
		 // REF eAllGenericSuperTypes
   @GET
   @Path("eAllGenericSuperTypes")
   public java.util.List<org.eclipse.emf.ecore.EGenericType> getEAllGenericSuperTypes(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEAllGenericSuperTypes();
     } else {
      return java.util.Collections.singletonList(instance.getEAllGenericSuperTypes().get(index));
     }
          
   }
	
}

