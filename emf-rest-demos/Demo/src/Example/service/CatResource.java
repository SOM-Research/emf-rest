
package Example.service;

import java.util.List;

import javax.ws.rs.*;

import Example.*;

public class CatResource{

    private Example.Cat instance;
    
    public CatResource(Example.Cat instance){
    	this.instance = instance;
    }

	@GET
	public Example.Cat getCat(){
		return instance;
	}
		
	@PUT
	public void updateCat(Example.Cat object){
		
	}

	
}

