
package Example.service;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.eclipse.emf.ecore.util.EcoreUtil;
import javax.ws.rs.core.Response;
import webmapi.service.configuration.Wrapper;

import Example.*;
import Example.impl.*;

public class DaughterResource{

    private Example.Daughter instance;
    private String id;
    private webmapi.storage.IModelStorage storage;
    public DaughterResource(Example.Daughter instance,String id,webmapi.storage.IModelStorage storage){
    	this.instance = instance;
    	this.id = id;
    	this.storage = storage;
    }

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Example.Daughter getDaughter(){
		return instance;
	}
		
	@PUT
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void updateDaughter(DaughterImpl object){
		storage.put(EcoreUtil.getIdentification(instance), object);
	}
	@DELETE
	public void deleteDaughter() {
		storage.remove(EcoreUtil.getIdentification(instance));
	}

  
   @Path("family")
   public Example.service.FamilyResource getResourceFamily()
   {
      return new Example.service.FamilyResource(instance.getFamily(),id, storage);
   }    
		
		 // REF family
		
		
	
}

