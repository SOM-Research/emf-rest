
package Example.service;

import java.util.ArrayList;

import javax.ws.rs.*;

import Example.*;

public class CompoundDogResource{

    private java.util.List<Dog> listInstance;
	private	java.util.List<Example.Dog> dogList = new ArrayList<Example.Dog>();
	private	java.util.List<Example.RaceDog> raceDogList = new ArrayList<Example.RaceDog>();
	private	java.util.List<Example.HuntingDog> huntingDogList = new ArrayList<Example.HuntingDog>();
	private webmapi.service.container.DogContainer instance;
    
    public CompoundDogResource(Dog instance){
        ArrayList list = new ArrayList();
        list.add(instance);
        initialize(list);
    }
    
    public CompoundDogResource(java.util.List<Dog> listInstance){
         initialize(listInstance);
    }
    
    private void initialize(java.util.List<Dog> listInstance){
    	this.listInstance = listInstance;
		for(Dog element: listInstance){
		    if(element instanceof Example.RaceDog){
		    	raceDogList.add((Example.RaceDog)element);
		    } 
 else 		    if(element instanceof Example.HuntingDog){
		    	huntingDogList.add((Example.HuntingDog)element);
		    } 
 else 		    if(element instanceof Example.Dog){
		    	dogList.add((Example.Dog)element);
		    } 
     	}	
     	instance = new webmapi.service.container.DogContainer(
dogList  
 
 , raceDogList  
 
 , huntingDogList  
 
		);	    	
    }

	@GET
	public webmapi.service.container.DogContainer getDogContainer(){
		return instance; 
	}
	
		
	@PUT
	public void updateDog(Dog dog){
		
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

