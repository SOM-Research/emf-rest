package webmapi.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.servlet.http.HttpServletRequest;

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
     return new FamilyResource((Family)storage.get("Example.Family",id));
   }

   @POST 
   @Path("Family")
   public void createFamily(Family obj)
   {
     initStorage();
     String id = IdentificationResolver.getFamilyId(obj);
     storage.put("Example.Family",id, obj);
   }
   
   @DELETE 
   @Path("Family/{id}")
   public void deleteFamily(@PathParam("id") String id)
   {
     initStorage();
     storage.remove("Example.Family",id);
   }   
   @Path("Dog/{id}")
   public DogResource handleDog(@PathParam("id") String id)
   {
     initStorage();
     return new DogResource((Dog)storage.get("Example.Dog",id));
   }

   @POST 
   @Path("Dog")
   public void createDog(Dog obj)
   {
     initStorage();
     String id = IdentificationResolver.getDogId(obj);
     storage.put("Example.Dog",id, obj);
   }
   
   @DELETE 
   @Path("Dog/{id}")
   public void deleteDog(@PathParam("id") String id)
   {
     initStorage();
     storage.remove("Example.Dog",id);
   }   
   @Path("Cat/{id}")
   public CatResource handleCat(@PathParam("id") String id)
   {
     initStorage();
     return new CatResource((Cat)storage.get("Example.Cat",id));
   }

   @POST 
   @Path("Cat")
   public void createCat(Cat obj)
   {
     initStorage();
     String id = IdentificationResolver.getCatId(obj);
     storage.put("Example.Cat",id, obj);
   }
   
   @DELETE 
   @Path("Cat/{id}")
   public void deleteCat(@PathParam("id") String id)
   {
     initStorage();
     storage.remove("Example.Cat",id);
   }   
   @Path("RaceDog/{id}")
   public RaceDogResource handleRaceDog(@PathParam("id") String id)
   {
     initStorage();
     return new RaceDogResource((RaceDog)storage.get("Example.RaceDog",id));
   }

   @POST 
   @Path("RaceDog")
   public void createRaceDog(RaceDog obj)
   {
     initStorage();
     String id = IdentificationResolver.getRaceDogId(obj);
     storage.put("Example.RaceDog",id, obj);
   }
   
   @DELETE 
   @Path("RaceDog/{id}")
   public void deleteRaceDog(@PathParam("id") String id)
   {
     initStorage();
     storage.remove("Example.RaceDog",id);
   }   
   @Path("HuntingDog/{id}")
   public HuntingDogResource handleHuntingDog(@PathParam("id") String id)
   {
     initStorage();
     return new HuntingDogResource((HuntingDog)storage.get("Example.HuntingDog",id));
   }

   @POST 
   @Path("HuntingDog")
   public void createHuntingDog(HuntingDog obj)
   {
     initStorage();
     String id = IdentificationResolver.getHuntingDogId(obj);
     storage.put("Example.HuntingDog",id, obj);
   }
   
   @DELETE 
   @Path("HuntingDog/{id}")
   public void deleteHuntingDog(@PathParam("id") String id)
   {
     initStorage();
     storage.remove("Example.HuntingDog",id);
   }   
}

