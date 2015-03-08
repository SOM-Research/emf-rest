
package org.eclipse.emf.ecore.service;

import java.util.List;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class EGenericTypeResource{

    private org.eclipse.emf.ecore.EGenericType instance;
    
    public EGenericTypeResource(org.eclipse.emf.ecore.EGenericType instance){
    	this.instance = instance;
    }

	@GET
	public org.eclipse.emf.ecore.EGenericType getEGenericType(){
		return instance;
	}
		
	@PUT
	public void updateEGenericType(org.eclipse.emf.ecore.EGenericType object){
		
	}

  
   @Path("eUpperBound")
   public org.eclipse.emf.ecore.service.EGenericTypeResource getResourceEUpperBound()
   {
      return new org.eclipse.emf.ecore.service.EGenericTypeResource(instance.getEUpperBound());
   }    
		 // REF eUpperBound
   @Path("eTypeArguments/{id}")
   public org.eclipse.emf.ecore.service.EGenericTypeResource getResourceETypeArguments
   (@PathParam("id") String id)
   {
      return new org.eclipse.emf.ecore.service.EGenericTypeResource(webmapi.service.IdentificationResolver.findEGenericTypeById(instance.getETypeArguments(),id));   
   }  
		 // REF eTypeArguments
   @GET
   @Path("eTypeArguments")
   public java.util.List<org.eclipse.emf.ecore.EGenericType> getETypeArguments(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getETypeArguments();
     } else {
      return java.util.Collections.singletonList(instance.getETypeArguments().get(index));
     }
          
   }
   @POST
   @Path("eTypeArguments")
   public void addETypeArguments
   (org.eclipse.emf.ecore.EGenericType obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getETypeArguments().add(obj);
   }
   @Path("eRawType")
   public org.eclipse.emf.ecore.service.CompoundEClassifierResource getResourceERawType()
   {
      return new org.eclipse.emf.ecore.service.CompoundEClassifierResource(instance.getERawType());   
   }  
     
  
   @Path("eLowerBound")
   public org.eclipse.emf.ecore.service.EGenericTypeResource getResourceELowerBound()
   {
      return new org.eclipse.emf.ecore.service.EGenericTypeResource(instance.getELowerBound());
   }    
		 // REF eLowerBound
  
   @Path("eTypeParameter")
   public org.eclipse.emf.ecore.service.ETypeParameterResource getResourceETypeParameter()
   {
      return new org.eclipse.emf.ecore.service.ETypeParameterResource(instance.getETypeParameter());
   }    
		 // REF eTypeParameter
   @Path("eClassifier")
   public org.eclipse.emf.ecore.service.CompoundEClassifierResource getResourceEClassifier()
   {
      return new org.eclipse.emf.ecore.service.CompoundEClassifierResource(instance.getEClassifier());   
   }  
     
	
}

