
package Example.service;

import java.util.ArrayList;

import javax.ws.rs.*;

import Example.*;

public class CompoundMemberResource{

    private java.util.List<Member> listInstance;
	private	java.util.List<Example.Parent> parentList = new ArrayList<Example.Parent>();
	private	java.util.List<Example.Son> sonList = new ArrayList<Example.Son>();
	private	java.util.List<Example.Daughter> daughterList = new ArrayList<Example.Daughter>();
	private webmapi.service.container.MemberContainer instance;
    
    public CompoundMemberResource(Member instance){
        ArrayList list = new ArrayList();
        list.add(instance);
        initialize(list);
    }
    
    public CompoundMemberResource(java.util.List<Member> listInstance){
         initialize(listInstance);
    }
    
    private void initialize(java.util.List<Member> listInstance){
    	this.listInstance = listInstance;
		for(Member element: listInstance){
		    if(element instanceof Example.Parent){
		    	parentList.add((Example.Parent)element);
		    } 
 else 		    if(element instanceof Example.Son){
		    	sonList.add((Example.Son)element);
		    } 
 else 		    if(element instanceof Example.Daughter){
		    	daughterList.add((Example.Daughter)element);
		    } 
     	}	
     	instance = new webmapi.service.container.MemberContainer(
parentList  
 
 , sonList  
 
 , daughterList  
 
		);	    	
    }

	@GET
	public webmapi.service.container.MemberContainer getMemberContainer(){
		return instance; 
	}
	
		
	@PUT
	public void updateMember(Member member){
		
	}

   @Path("Parent/{id}")
   public Example.service.ParentResource getResourceParent
   (@PathParam("id") String id)
   {
      return new Example.service.ParentResource(webmapi.service.IdentificationResolver.findParentById(instance.getParent(),id));   
   }  
   @GET
   @Path("Parent")
   public java.util.List<Example.Parent> getParent(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getParent();
     } else {
      return java.util.Collections.singletonList(instance.getParent().get(index));
     }
          
   }
   @POST
   @Path("Parent")
   public void setParent
   (Parent obj
   )
   {
     //TODO
   }
   @Path("Son/{id}")
   public Example.service.SonResource getResourceSon
   (@PathParam("id") String id)
   {
      return new Example.service.SonResource(webmapi.service.IdentificationResolver.findSonById(instance.getSon(),id));   
   }  
   @GET
   @Path("Son")
   public java.util.List<Example.Son> getSon(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getSon();
     } else {
      return java.util.Collections.singletonList(instance.getSon().get(index));
     }
          
   }
   @POST
   @Path("Son")
   public void setSon
   (Son obj
   )
   {
     //TODO
   }
   @Path("Daughter/{id}")
   public Example.service.DaughterResource getResourceDaughter
   (@PathParam("id") String id)
   {
      return new Example.service.DaughterResource(webmapi.service.IdentificationResolver.findDaughterById(instance.getDaughter(),id));   
   }  
   @GET
   @Path("Daughter")
   public java.util.List<Example.Daughter> getDaughter(@QueryParam("index") @DefaultValue("-1") int index)
   {
     if(index==-1){
      return instance.getDaughter();
     } else {
      return java.util.Collections.singletonList(instance.getDaughter().get(index));
     }
          
   }
   @POST
   @Path("Daughter")
   public void setDaughter
   (Daughter obj
   )
   {
     //TODO
   }
	
}

