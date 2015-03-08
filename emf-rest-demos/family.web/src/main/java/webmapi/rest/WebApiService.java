package webmapi.rest;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ejb.Stateless;
import javax.inject.Inject;



import webmapi.util.ResourceSaver;

import Example.*;
import Example.service.*;

@Path("")
public class WebApiService{

  	@Inject
	private ResourceSaver resourceSaver;


   @Path("Family/{id}")
   public FamilyResource handleFamily(@PathParam("id") String id)
   {
     return new FamilyResource((Family)resourceSaver.get("Example.Family",id),id,resourceSaver);
   }

  
 
   @Path("Dog/{id}")
   public DogResource handleDog(@PathParam("id") String id)
   {
     return new DogResource((Dog)resourceSaver.get("Example.Dog",id),id,resourceSaver);
   }

  
 
   @Path("Cat/{id}")
   public CatResource handleCat(@PathParam("id") String id)
   {
     return new CatResource((Cat)resourceSaver.get("Example.Cat",id),id,resourceSaver);
   }

  
 
   @Path("RaceDog/{id}")
   public RaceDogResource handleRaceDog(@PathParam("id") String id)
   {
     return new RaceDogResource((RaceDog)resourceSaver.get("Example.RaceDog",id),id,resourceSaver);
   }

  
 
   @Path("HuntingDog/{id}")
   public HuntingDogResource handleHuntingDog(@PathParam("id") String id)
   {
     return new HuntingDogResource((HuntingDog)resourceSaver.get("Example.HuntingDog",id),id,resourceSaver);
   }

  
 
}

