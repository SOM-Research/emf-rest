
package Example.service;

import java.util.List;

import javax.ws.rs.*;

import Example.*;

public class ParentResource{

    private Example.Parent instance;
    
    public ParentResource(Example.Parent instance){
    	this.instance = instance;
    }

	@GET
	public Example.Parent getParent(){
		return instance;
	}
		
	@PUT
	public void updateParent(Example.Parent object){
		
	}

  
   @Path("family")
   public Example.service.FamilyResource getResourceFamily()
   {
      return new Example.service.FamilyResource(instance.getFamily());
   }    
		 // REF family
	
}

