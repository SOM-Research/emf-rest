
package Example.service;

import java.util.List;

import javax.ws.rs.*;

import Example.*;

public class PetResource{

    private Example.Pet instance;
    
    public PetResource(Example.Pet instance){
    	this.instance = instance;
    }

	@GET
	public Example.Pet getPet(){
		return instance;
	}
		
	@PUT
	public void updatePet(Example.Pet object){
		
	}

	
}

