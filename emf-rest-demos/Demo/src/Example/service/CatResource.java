
package Example.service;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.eclipse.emf.ecore.util.EcoreUtil;
import javax.ws.rs.core.Response;
import webmapi.service.configuration.Wrapper;

import Example.*;
import Example.impl.*;

public class CatResource{

    private Example.Cat instance;
    private String id;
    private webmapi.storage.IModelStorage storage;
    public CatResource(Example.Cat instance,String id,webmapi.storage.IModelStorage storage){
    	this.instance = instance;
    	this.id = id;
    	this.storage = storage;
    }

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Example.Cat getCat(){
		return instance;
	}
		
	@PUT
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void updateCat(CatImpl object){
		storage.put(EcoreUtil.getIdentification(instance), object);
	}
	@DELETE
	public void deleteCat() {
		storage.remove(EcoreUtil.getIdentification(instance));
	}

	
}

