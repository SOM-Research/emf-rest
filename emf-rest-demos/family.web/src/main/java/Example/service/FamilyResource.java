
package Example.service;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.eclipse.emf.ecore.util.EcoreUtil;
import javax.ws.rs.core.Response;
import webmapi.service.configuration.Wrapper;
import webmapi.util.ResourceSaver;
import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;
import javax.annotation.security.RolesAllowed;
import javax.annotation.security.PermitAll;

import Example.*;
import Example.impl.*;
public class FamilyResource{

    private Example.Family instance;
    private String id;
	private ResourceSaver resourceSaver;
    public FamilyResource(Example.Family instance,String id, ResourceSaver r){
    	this.instance = instance;
    	this.id = id;
    	resourceSaver = r;
    }

	
 @PermitAll	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Mapped(namespaceMap = {
	        @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy")
	})
	public Example.Family getFamily(){
		return instance;
	}

 @PermitAll	@PUT
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Mapped(namespaceMap = {
	        @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy")
	})
	public void updateFamily(FamilyImpl object){
		resourceSaver.put(EcoreUtil.getIdentification(instance), object);
	}
	
 @PermitAll	@DELETE
	@Mapped(namespaceMap = {
	        @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy")
	})
	public void deleteFamily() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

   @Path("parents/{id}")
   public Example.service.ParentResource getResourceParents
   (@PathParam("id") String id)
   {
      return new Example.service.ParentResource(webmapi.service.IdentificationResolver.findParentById(instance.getParents(),id),id,resourceSaver);   
   }  
		
		 // REF parents
		
   @GET
   @Path("parents")
   @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
   public Response getParents(@QueryParam("index") @DefaultValue("-1") int index)
   {
  
        if (index == -1) {
			Wrapper<Parent> entity = new Wrapper<Parent>(instance.getParents());
			return Response.ok(entity).build();
		} else {
			return Response.ok(instance.getParents().get(index)).build();

		}  
   }
   @POST
   @Path("parents")
   public void addParents
   (ParentImpl obj
   )
   {
     instance.getParents().add(obj);
     resourceSaver.save();
   }
		
   @Path("sons/{id}")
   public Example.service.SonResource getResourceSons
   (@PathParam("id") String id)
   {
      return new Example.service.SonResource(webmapi.service.IdentificationResolver.findSonById(instance.getSons(),id),id,resourceSaver);   
   }  
		
		 // REF sons
		
   @GET
   @Path("sons")
   @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
   public Response getSons(@QueryParam("index") @DefaultValue("-1") int index)
   {
  
        if (index == -1) {
			Wrapper<Son> entity = new Wrapper<Son>(instance.getSons());
			return Response.ok(entity).build();
		} else {
			return Response.ok(instance.getSons().get(index)).build();

		}  
   }
   @POST
   @Path("sons")
   public void addSons
   (SonImpl obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getSons().add(obj);
     resourceSaver.save();
   }
		
   @Path("daughters/{id}")
   public Example.service.DaughterResource getResourceDaughters
   (@PathParam("id") String id)
   {
      return new Example.service.DaughterResource(webmapi.service.IdentificationResolver.findDaughterById(instance.getDaughters(),id),id,resourceSaver);   
   }  
		
		 // REF daughters
		
   @GET
   @Path("daughters")
   @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
   public Response getDaughters(@QueryParam("index") @DefaultValue("-1") int index)
   {
  
        if (index == -1) {
			Wrapper<Daughter> entity = new Wrapper<Daughter>(instance.getDaughters());
			return Response.ok(entity).build();
		} else {
			return Response.ok(instance.getDaughters().get(index)).build();

		}  
   }
   @POST
   @Path("daughters")
   public void addDaughters
   (DaughterImpl obj
   )
   {
     instance.getDaughters().add(obj);
     resourceSaver.save();
   }
		
   @Path("pets/{id}")
   public Example.service.PetResource getResourcePets
   (@PathParam("id") String id)
   {
      return new Example.service.PetResource(webmapi.service.IdentificationResolver.findPetById(instance.getPets(),id),id,resourceSaver);   
   }  
		
		 // REF pets
		
   @GET
   @Path("pets")
   @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
   public Response getPets(@QueryParam("index") @DefaultValue("-1") int index)
   {
  
        if (index == -1) {
			Wrapper<Pet> entity = new Wrapper<Pet>(instance.getPets());
			return Response.ok(entity).build();
		} else {
			return Response.ok(instance.getPets().get(index)).build();

		}  
   }
   @POST
   @Path("pets")
   public void addPets
   (PetImpl obj
      , @DefaultValue("-1") @QueryParam("index") int index
   )
   {
     instance.getPets().add(obj);
     resourceSaver.save();
   }
		
	
}

