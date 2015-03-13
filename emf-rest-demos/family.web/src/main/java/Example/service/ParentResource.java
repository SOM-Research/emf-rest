
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
public class ParentResource{

    private Example.Parent instance;
    private String id;
	private ResourceSaver resourceSaver;
    public ParentResource(Example.Parent instance,String id, ResourceSaver r){
    	this.instance = instance;
    	this.id = id;
    	resourceSaver = r;
    }

	
 @PermitAll	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Mapped(namespaceMap = {
	        @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy")
	})
	public Example.Parent getParent(){
		return instance;
	}

 @PermitAll	@PUT
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Mapped(namespaceMap = {
	        @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy")
	})
	public void updateParent(ParentImpl object){
		resourceSaver.put(EcoreUtil.getIdentification(instance), object);
	}
	
 @PermitAll	@DELETE
	@Mapped(namespaceMap = {
	        @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy")
	})
	public void deleteParent() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

  
   @Path("family")
   public Example.service.FamilyResource getResourceFamily()
   {
      return new Example.service.FamilyResource(instance.getFamily(),id,resourceSaver);
   }    
		
		 // REF family
		
		
	
}

