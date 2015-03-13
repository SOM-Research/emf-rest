
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
public class RaceDogResource{

    private Example.RaceDog instance;
    private String id;
	private ResourceSaver resourceSaver;
    public RaceDogResource(Example.RaceDog instance,String id, ResourceSaver r){
    	this.instance = instance;
    	this.id = id;
    	resourceSaver = r;
    }

	
 @PermitAll	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Mapped(namespaceMap = {
	        @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy")
	})
	public Example.RaceDog getRaceDog(){
		return instance;
	}

 @PermitAll	@PUT
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Mapped(namespaceMap = {
	        @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy")
	})
	public void updateRaceDog(RaceDogImpl object){
		resourceSaver.put(EcoreUtil.getIdentification(instance), object);
	}
	
 @PermitAll	@DELETE
	@Mapped(namespaceMap = {
	        @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy")
	})
	public void deleteRaceDog() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	
}

