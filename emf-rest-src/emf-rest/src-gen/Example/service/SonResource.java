
package Example.service;

import java.util.List;

import javax.ws.rs.*;

import Example.*;

public class SonResource{

    private Example.Son instance;
    
    public SonResource(Example.Son instance){
    	this.instance = instance;
    }

	@GET
	public Example.Son getSon(){
		return instance;
	}
		
	@PUT
	public void updateSon(Example.Son object){
		
	}

  
   @Path("family")
   public Example.service.FamilyResource getResourceFamily()
   {
      return new Example.service.FamilyResource(instance.getFamily());
   }    
		 // REF family
	
}

