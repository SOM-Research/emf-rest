
package Example.service;

import java.util.List;

import javax.ws.rs.*;

import Example.*;

public class RaceDogResource{

    private Example.RaceDog instance;
    
    public RaceDogResource(Example.RaceDog instance){
    	this.instance = instance;
    }

	@GET
	public Example.RaceDog getRaceDog(){
		return instance;
	}
		
	@PUT
	public void updateRaceDog(Example.RaceDog object){
		
	}

	
}

