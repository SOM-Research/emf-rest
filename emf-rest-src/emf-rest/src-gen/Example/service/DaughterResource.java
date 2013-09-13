
package Example.service;

import java.util.List;

import javax.ws.rs.*;

import Example.*;

public class DaughterResource{

    private Example.Daughter instance;
    
    public DaughterResource(Example.Daughter instance){
    	this.instance = instance;
    }

	@GET
	public Example.Daughter getDaughter(){
		return instance;
	}
		
	@PUT
	public void updateDaughter(Example.Daughter object){
		
	}

  
   @Path("family")
   public Example.service.FamilyResource getResourceFamily()
   {
      return new Example.service.FamilyResource(instance.getFamily());
   }    
		 // REF family
	
}

