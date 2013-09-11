
package Example.service;

import java.util.List;

import javax.ws.rs.*;

import Example.*;

public class DogResource{

    private Example.Dog instance;
    
    public DogResource(Example.Dog instance){
    	this.instance = instance;
    }

	@GET
	public Example.Dog getDog(){
		return instance;
	}
		
	@PUT
	public void updateDog(Example.Dog object){
		
	}

	
}

