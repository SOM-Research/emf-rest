
package Example.service;

import java.util.List;

import javax.ws.rs.*;

import Example.*;

public class FamilyResource{

    private Example.Family instance;
    
    public FamilyResource(Example.Family instance){
    	this.instance = instance;
    }

	@GET
	public Example.Family getFamily(){
		return instance;
	}
		
	@PUT
	public void updateFamily(Example.Family object){
		
	}

   @Path("parents/{id}")
   public Example.service.ParentResource getResourceParents
   (@PathParam("id") String id)
   {
      return new Example.service.ParentResource(webmapi.service.IdentificationResolver.findParentById(instance.getParents(),id));   
   }  
		 // REF parents
   @GET
   @Path("parents")
   public java.util.List<Example.Parent> getParents(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getParents();
     } else {
      return java.util.Collections.singletonList(instance.getParents().get(index));
     }
          
   }
   @POST
   @Path("parents")
   public void addParents
   (Example.Parent obj
   )
   {
     instance.getParents().add(obj);
   }
   @Path("sons/{id}")
   public Example.service.SonResource getResourceSons
   (@PathParam("id") String id)
   {
      return new Example.service.SonResource(webmapi.service.IdentificationResolver.findSonById(instance.getSons(),id));   
   }  
		 // REF sons
   @GET
   @Path("sons")
   public java.util.List<Example.Son> getSons(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getSons();
     } else {
      return java.util.Collections.singletonList(instance.getSons().get(index));
     }
          
   }
   @POST
   @Path("sons")
   public void addSons
   (Example.Son obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getSons().add(obj);
   }
   @Path("daughters/{id}")
   public Example.service.DaughterResource getResourceDaughters
   (@PathParam("id") String id)
   {
      return new Example.service.DaughterResource(webmapi.service.IdentificationResolver.findDaughterById(instance.getDaughters(),id));   
   }  
		 // REF daughters
   @GET
   @Path("daughters")
   public java.util.List<Example.Daughter> getDaughters(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getDaughters();
     } else {
      return java.util.Collections.singletonList(instance.getDaughters().get(index));
     }
          
   }
   @POST
   @Path("daughters")
   public void addDaughters
   (Example.Daughter obj
   )
   {
     instance.getDaughters().add(obj);
   }
   @Path("pets")
   public Example.service.CompoundPetResource getResourcePets()
   {
      return new Example.service.CompoundPetResource(instance.getPets());   
   }  
     
	
}

