
package webmapi.admin;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import webmapi.model.Role;
import webmapi.model.User;



@Model
public class RoleController {

    @Inject
    private FacesContext facesContext;


    @Inject
    private RoleRepository roleRepository;
    
    
    
  private List<Role> allRoles;

	

    @PostConstruct
    public void initNewUser() {
        allRoles = roleRepository.findAllRoles();
    }

    public List<Role> getRolesByUser(User user){
    	return roleRepository.findAllByUser(user);
    }
    

    private String getRootErrorMessage(Exception e) {
        // Default to general error message that registration failed.
        String errorMessage = "Registration failed. See server log for more information";
        if (e == null) {
            // This shouldn't happen, but return the default messages
            return errorMessage;
        }

        // Start with the exception and recurse to find the root cause
        Throwable t = e;
        while (t != null) {
            // Get the message from the Throwable class instance
            errorMessage = t.getLocalizedMessage();
            t = t.getCause();
        }
        // This is the root cause message
        return errorMessage;
    }
    
   
  	
  	

}
