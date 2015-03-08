package webmapi.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;

import Example.*;
import Example.service.*;

@Path("")
public class WebApiService{

  	@Context
	private HttpServletRequest request;

	private webmapi.storage.IModelStorage storage;

	private void initStorage() {
		if (storage == null) {
			String modelsPath = request.getServletContext().getRealPath("models");
			storage = new webmapi.storage.MemoryStorage(modelsPath);
		}
	}


   @Path("Family/{id}")
   public FamilyResource handleFamily(@PathParam("id") String id)
   {
     initStorage();
     return new FamilyResource((Family)storage.get("Example.Family",id),id, storage);
   }

  
 
   @Path("Dog/{id}")
   public DogResource handleDog(@PathParam("id") String id)
   {
     initStorage();
     return new DogResource((Dog)storage.get("Example.Dog",id),id, storage);
   }

  
 
   @Path("Cat/{id}")
   public CatResource handleCat(@PathParam("id") String id)
   {
     initStorage();
     return new CatResource((Cat)storage.get("Example.Cat",id),id, storage);
   }

  
 
   @Path("RaceDog/{id}")
   public RaceDogResource handleRaceDog(@PathParam("id") String id)
   {
     initStorage();
     return new RaceDogResource((RaceDog)storage.get("Example.RaceDog",id),id, storage);
   }

  
 
   @Path("HuntingDog/{id}")
   public HuntingDogResource handleHuntingDog(@PathParam("id") String id)
   {
     initStorage();
     return new HuntingDogResource((HuntingDog)storage.get("Example.HuntingDog",id),id, storage);
   }

  
 
}

