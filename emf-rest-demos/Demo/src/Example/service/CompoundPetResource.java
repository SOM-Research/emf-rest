
package Example.service;

import java.util.ArrayList;

import javax.ws.rs.*;

import Example.*;

public class CompoundPetResource{

    private java.util.List<Pet> listInstance;
	private	java.util.List<Example.Dog> dogList = new ArrayList<Example.Dog>();
	private	java.util.List<Example.Cat> catList = new ArrayList<Example.Cat>();
	private	java.util.List<Example.RaceDog> raceDogList = new ArrayList<Example.RaceDog>();
	private	java.util.List<Example.HuntingDog> huntingDogList = new ArrayList<Example.HuntingDog>();
	private webmapi.service.container.PetContainer instance;
    
    public CompoundPetResource(Pet instance){
        ArrayList list = new ArrayList();
        list.add(instance);
        initialize(list);
    }
    
    public CompoundPetResource(java.util.List<Pet> listInstance){
         initialize(listInstance);
    }
    
    private void initialize(java.util.List<Pet> listInstance){
    	this.listInstance = listInstance;
		for(Pet element: listInstance){
		    if(element instanceof Example.Cat){
		    	catList.add((Example.Cat)element);
		    } 
 else 		    if(element instanceof Example.RaceDog){
		    	raceDogList.add((Example.RaceDog)element);
		    } 
 else 		    if(element instanceof Example.HuntingDog){
		    	huntingDogList.add((Example.HuntingDog)element);
		    } 
 else 		    if(element instanceof Example.Dog){
		    	dogList.add((Example.Dog)element);
		    } 
     	}	
     	instance = new webmapi.service.container.PetContainer(
dogList  
 
 , catList  
 
 , raceDogList  
 
 , huntingDogList  
 
		);	    	
    }

	@GET
	public webmapi.service.container.PetContainer getPetContainer(){
		return instance; 
	}
	
		
	@PUT
	public void updatePet(Pet pet){
		
	}

   @Path("Dog/{id}")
   public Example.service.DogResource getResourceDog
   (@PathParam("id") String id)
   {
      return new Example.service.DogResource(webmapi.service.IdentificationResolver.findDogById(instance.getDog(),id));   
   }  
   @GET
   @Path("Dog")
   public java.util.List<Example.Dog> getDog(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getDog();
     } else {
      return java.util.Collections.singletonList(instance.getDog().get(index));
     }
          
   }
   @POST
   @Path("Dog")
   public void setDog
   (Dog obj
   )
   {
     //TODO
   }
   @Path("Cat/{id}")
   public Example.service.CatResource getResourceCat
   (@PathParam("id") String id)
   {
      return new Example.service.CatResource(webmapi.service.IdentificationResolver.findCatById(instance.getCat(),id));   
   }  
   @GET
   @Path("Cat")
   public java.util.List<Example.Cat> getCat(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getCat();
     } else {
      return java.util.Collections.singletonList(instance.getCat().get(index));
     }
          
   }
   @POST
   @Path("Cat")
   public void setCat
   (Cat obj
   )
   {
     //TODO
   }
   @Path("RaceDog/{id}")
   public Example.service.RaceDogResource getResourceRaceDog
   (@PathParam("id") String id)
   {
      return new Example.service.RaceDogResource(webmapi.service.IdentificationResolver.findRaceDogById(instance.getRaceDog(),id));   
   }  
   @GET
   @Path("RaceDog")
   public java.util.List<Example.RaceDog> getRaceDog(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getRaceDog();
     } else {
      return java.util.Collections.singletonList(instance.getRaceDog().get(index));
     }
          
   }
   @POST
   @Path("RaceDog")
   public void setRaceDog
   (RaceDog obj
   )
   {
     //TODO
   }
   @Path("HuntingDog/{id}")
   public Example.service.HuntingDogResource getResourceHuntingDog
   (@PathParam("id") String id)
   {
      return new Example.service.HuntingDogResource(webmapi.service.IdentificationResolver.findHuntingDogById(instance.getHuntingDog(),id));   
   }  
   @GET
   @Path("HuntingDog")
   public java.util.List<Example.HuntingDog> getHuntingDog(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getHuntingDog();
     } else {
      return java.util.Collections.singletonList(instance.getHuntingDog().get(index));
     }
          
   }
   @POST
   @Path("HuntingDog")
   public void setHuntingDog
   (HuntingDog obj
   )
   {
     //TODO
   }
	
}

