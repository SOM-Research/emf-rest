
package Example.service;

import java.util.List;

import javax.ws.rs.*;

import Example.*;

public class HuntingDogResource{

    private Example.HuntingDog instance;
    
    public HuntingDogResource(Example.HuntingDog instance){
    	this.instance = instance;
    }

	@GET
	public Example.HuntingDog getHuntingDog(){
		return instance;
	}
		
	@PUT
	public void updateHuntingDog(Example.HuntingDog object){
		
	}

	
}

