
package Example.service;

import java.util.List;

import javax.ws.rs.*;

import Example.*;

public class MemberResource{

    private Example.Member instance;
    
    public MemberResource(Example.Member instance){
    	this.instance = instance;
    }

	@GET
	public Example.Member getMember(){
		return instance;
	}
		
	@PUT
	public void updateMember(Example.Member object){
		
	}

	
}

