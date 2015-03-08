
package org.eclipse.emf.ecore.service;

import java.util.ArrayList;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class CompoundEModelElementResource{

    private java.util.List<EModelElement> listInstance;
	private	java.util.List<org.eclipse.emf.ecore.EAttribute> eAttributeList = new ArrayList<org.eclipse.emf.ecore.EAttribute>();
	private	java.util.List<org.eclipse.emf.ecore.EAnnotation> eAnnotationList = new ArrayList<org.eclipse.emf.ecore.EAnnotation>();
	private	java.util.List<org.eclipse.emf.ecore.EClass> eClassList = new ArrayList<org.eclipse.emf.ecore.EClass>();
	private	java.util.List<org.eclipse.emf.ecore.EClassifier> eClassifierList = new ArrayList<org.eclipse.emf.ecore.EClassifier>();
	private	java.util.List<org.eclipse.emf.ecore.EDataType> eDataTypeList = new ArrayList<org.eclipse.emf.ecore.EDataType>();
	private	java.util.List<org.eclipse.emf.ecore.EEnum> eEnumList = new ArrayList<org.eclipse.emf.ecore.EEnum>();
	private	java.util.List<org.eclipse.emf.ecore.EEnumLiteral> eEnumLiteralList = new ArrayList<org.eclipse.emf.ecore.EEnumLiteral>();
	private	java.util.List<org.eclipse.emf.ecore.EFactory> eFactoryList = new ArrayList<org.eclipse.emf.ecore.EFactory>();
	private	java.util.List<org.eclipse.emf.ecore.ENamedElement> eNamedElementList = new ArrayList<org.eclipse.emf.ecore.ENamedElement>();
	private	java.util.List<org.eclipse.emf.ecore.EOperation> eOperationList = new ArrayList<org.eclipse.emf.ecore.EOperation>();
	private	java.util.List<org.eclipse.emf.ecore.EPackage> ePackageList = new ArrayList<org.eclipse.emf.ecore.EPackage>();
	private	java.util.List<org.eclipse.emf.ecore.EParameter> eParameterList = new ArrayList<org.eclipse.emf.ecore.EParameter>();
	private	java.util.List<org.eclipse.emf.ecore.EReference> eReferenceList = new ArrayList<org.eclipse.emf.ecore.EReference>();
	private	java.util.List<org.eclipse.emf.ecore.EStructuralFeature> eStructuralFeatureList = new ArrayList<org.eclipse.emf.ecore.EStructuralFeature>();
	private	java.util.List<org.eclipse.emf.ecore.ETypedElement> eTypedElementList = new ArrayList<org.eclipse.emf.ecore.ETypedElement>();
	private	java.util.List<org.eclipse.emf.ecore.ETypeParameter> eTypeParameterList = new ArrayList<org.eclipse.emf.ecore.ETypeParameter>();
	private webmapi.service.container.EModelElementContainer instance;
    
    public CompoundEModelElementResource(EModelElement instance){
        ArrayList list = new ArrayList();
        list.add(instance);
        initialize(list);
    }
    
    public CompoundEModelElementResource(java.util.List<EModelElement> listInstance){
         initialize(listInstance);
    }
    
    private void initialize(java.util.List<EModelElement> listInstance){
    	this.listInstance = listInstance;
		for(EModelElement element: listInstance){
		    if(element instanceof org.eclipse.emf.ecore.EAttribute){
		    	eAttributeList.add((org.eclipse.emf.ecore.EAttribute)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EAnnotation){
		    	eAnnotationList.add((org.eclipse.emf.ecore.EAnnotation)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EClass){
		    	eClassList.add((org.eclipse.emf.ecore.EClass)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EEnum){
		    	eEnumList.add((org.eclipse.emf.ecore.EEnum)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EEnumLiteral){
		    	eEnumLiteralList.add((org.eclipse.emf.ecore.EEnumLiteral)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EFactory){
		    	eFactoryList.add((org.eclipse.emf.ecore.EFactory)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EOperation){
		    	eOperationList.add((org.eclipse.emf.ecore.EOperation)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EPackage){
		    	ePackageList.add((org.eclipse.emf.ecore.EPackage)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EParameter){
		    	eParameterList.add((org.eclipse.emf.ecore.EParameter)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EReference){
		    	eReferenceList.add((org.eclipse.emf.ecore.EReference)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.ETypeParameter){
		    	eTypeParameterList.add((org.eclipse.emf.ecore.ETypeParameter)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EDataType){
		    	eDataTypeList.add((org.eclipse.emf.ecore.EDataType)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EStructuralFeature){
		    	eStructuralFeatureList.add((org.eclipse.emf.ecore.EStructuralFeature)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.EClassifier){
		    	eClassifierList.add((org.eclipse.emf.ecore.EClassifier)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.ETypedElement){
		    	eTypedElementList.add((org.eclipse.emf.ecore.ETypedElement)element);
		    } 
 else 		    if(element instanceof org.eclipse.emf.ecore.ENamedElement){
		    	eNamedElementList.add((org.eclipse.emf.ecore.ENamedElement)element);
		    } 
     	}	
     	instance = new webmapi.service.container.EModelElementContainer(
eAttributeList  
 
 , eAnnotationList  
 
 , eClassList  
 
 , eClassifierList  
 
 , eDataTypeList  
 
 , eEnumList  
 
 , eEnumLiteralList  
 
 , eFactoryList  
 
 , eNamedElementList  
 
 , eOperationList  
 
 , ePackageList  
 
 , eParameterList  
 
 , eReferenceList  
 
 , eStructuralFeatureList  
 
 , eTypedElementList  
 
 , eTypeParameterList  
 
		);	    	
    }

	@GET
	public webmapi.service.container.EModelElementContainer getEModelElementContainer(){
		return instance; 
	}
	
		
	@PUT
	public void updateEModelElement(EModelElement eModelElement){
		
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
   @Path("EAnnotation/{id}")
   public org.eclipse.emf.ecore.service.EAnnotationResource getResourceEAnnotation
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EAnnotationResource(webmapi.service.IdentificationResolver.findEAnnotationById(instance.getEAnnotation(),id));   
   }  
   @GET
   @Path("EAnnotation")
   public java.util.List<org.eclipse.emf.ecore.EAnnotation> getEAnnotation(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEAnnotation();
     } else {
      return java.util.Collections.singletonList(instance.getEAnnotation().get(index));
     }
          
   }
   @POST
   @Path("EAnnotation")
   public void setEAnnotation
   (EAnnotation obj
   )
   {
     //TODO
   }
   @Path("EClass/{id}")
   public org.eclipse.emf.ecore.service.EClassResource getResourceEClass
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EClassResource(webmapi.service.IdentificationResolver.findEClassById(instance.getEClass(),id));   
   }  
   @GET
   @Path("EClass")
   public java.util.List<org.eclipse.emf.ecore.EClass> getEClass(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEClass();
     } else {
      return java.util.Collections.singletonList(instance.getEClass().get(index));
     }
          
   }
   @POST
   @Path("EClass")
   public void setEClass
   (EClass obj
   )
   {
     //TODO
   }
   @Path("EClassifier/{id}")
   public org.eclipse.emf.ecore.service.EClassifierResource getResourceEClassifier
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EClassifierResource(webmapi.service.IdentificationResolver.findEClassifierById(instance.getEClassifier(),id));   
   }  
   @GET
   @Path("EClassifier")
   public java.util.List<org.eclipse.emf.ecore.EClassifier> getEClassifier(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEClassifier();
     } else {
      return java.util.Collections.singletonList(instance.getEClassifier().get(index));
     }
          
   }
   @POST
   @Path("EClassifier")
   public void setEClassifier
   (EClassifier obj
   )
   {
     //TODO
   }
   @Path("EDataType/{id}")
   public org.eclipse.emf.ecore.service.EDataTypeResource getResourceEDataType
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EDataTypeResource(webmapi.service.IdentificationResolver.findEDataTypeById(instance.getEDataType(),id));   
   }  
   @GET
   @Path("EDataType")
   public java.util.List<org.eclipse.emf.ecore.EDataType> getEDataType(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEDataType();
     } else {
      return java.util.Collections.singletonList(instance.getEDataType().get(index));
     }
          
   }
   @POST
   @Path("EDataType")
   public void setEDataType
   (EDataType obj
   )
   {
     //TODO
   }
   @Path("EEnum/{id}")
   public org.eclipse.emf.ecore.service.EEnumResource getResourceEEnum
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EEnumResource(webmapi.service.IdentificationResolver.findEEnumById(instance.getEEnum(),id));   
   }  
   @GET
   @Path("EEnum")
   public java.util.List<org.eclipse.emf.ecore.EEnum> getEEnum(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEEnum();
     } else {
      return java.util.Collections.singletonList(instance.getEEnum().get(index));
     }
          
   }
   @POST
   @Path("EEnum")
   public void setEEnum
   (EEnum obj
   )
   {
     //TODO
   }
   @Path("EEnumLiteral/{id}")
   public org.eclipse.emf.ecore.service.EEnumLiteralResource getResourceEEnumLiteral
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EEnumLiteralResource(webmapi.service.IdentificationResolver.findEEnumLiteralById(instance.getEEnumLiteral(),id));   
   }  
   @GET
   @Path("EEnumLiteral")
   public java.util.List<org.eclipse.emf.ecore.EEnumLiteral> getEEnumLiteral(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEEnumLiteral();
     } else {
      return java.util.Collections.singletonList(instance.getEEnumLiteral().get(index));
     }
          
   }
   @POST
   @Path("EEnumLiteral")
   public void setEEnumLiteral
   (EEnumLiteral obj
   )
   {
     //TODO
   }
   @Path("EFactory/{id}")
   public org.eclipse.emf.ecore.service.EFactoryResource getResourceEFactory
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EFactoryResource(webmapi.service.IdentificationResolver.findEFactoryById(instance.getEFactory(),id));   
   }  
   @GET
   @Path("EFactory")
   public java.util.List<org.eclipse.emf.ecore.EFactory> getEFactory(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEFactory();
     } else {
      return java.util.Collections.singletonList(instance.getEFactory().get(index));
     }
          
   }
   @POST
   @Path("EFactory")
   public void setEFactory
   (EFactory obj
   )
   {
     //TODO
   }
   @Path("ENamedElement/{id}")
   public org.eclipse.emf.ecore.service.ENamedElementResource getResourceENamedElement
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.ENamedElementResource(webmapi.service.IdentificationResolver.findENamedElementById(instance.getENamedElement(),id));   
   }  
   @GET
   @Path("ENamedElement")
   public java.util.List<org.eclipse.emf.ecore.ENamedElement> getENamedElement(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getENamedElement();
     } else {
      return java.util.Collections.singletonList(instance.getENamedElement().get(index));
     }
          
   }
   @POST
   @Path("ENamedElement")
   public void setENamedElement
   (ENamedElement obj
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
   @Path("EPackage/{id}")
   public org.eclipse.emf.ecore.service.EPackageResource getResourceEPackage
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EPackageResource(webmapi.service.IdentificationResolver.findEPackageById(instance.getEPackage(),id));   
   }  
   @GET
   @Path("EPackage")
   public java.util.List<org.eclipse.emf.ecore.EPackage> getEPackage(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getEPackage();
     } else {
      return java.util.Collections.singletonList(instance.getEPackage().get(index));
     }
          
   }
   @POST
   @Path("EPackage")
   public void setEPackage
   (EPackage obj
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
   @Path("ETypedElement/{id}")
   public org.eclipse.emf.ecore.service.ETypedElementResource getResourceETypedElement
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.ETypedElementResource(webmapi.service.IdentificationResolver.findETypedElementById(instance.getETypedElement(),id));   
   }  
   @GET
   @Path("ETypedElement")
   public java.util.List<org.eclipse.emf.ecore.ETypedElement> getETypedElement(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getETypedElement();
     } else {
      return java.util.Collections.singletonList(instance.getETypedElement().get(index));
     }
          
   }
   @POST
   @Path("ETypedElement")
   public void setETypedElement
   (ETypedElement obj
   )
   {
     //TODO
   }
   @Path("ETypeParameter/{id}")
   public org.eclipse.emf.ecore.service.ETypeParameterResource getResourceETypeParameter
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.ETypeParameterResource(webmapi.service.IdentificationResolver.findETypeParameterById(instance.getETypeParameter(),id));   
   }  
   @GET
   @Path("ETypeParameter")
   public java.util.List<org.eclipse.emf.ecore.ETypeParameter> getETypeParameter(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getETypeParameter();
     } else {
      return java.util.Collections.singletonList(instance.getETypeParameter().get(index));
     }
          
   }
   @POST
   @Path("ETypeParameter")
   public void setETypeParameter
   (ETypeParameter obj
   )
   {
     //TODO
   }
	
}

