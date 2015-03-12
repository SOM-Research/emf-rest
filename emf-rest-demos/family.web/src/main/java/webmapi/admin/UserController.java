
package webmapi.admin;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import webmapi.model.Role;
import webmapi.model.User;

@Named
@SessionScoped
public class UserController implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -9031601655915200180L;

	@Inject
    private FacesContext facesContext;

    @Inject
    private UserRegistration userRegistration;

    @Inject
    private RoleRepository roleRepository;
    


    private User newUser;
	
	
	private User selectedUser;
	
    private Role[] selectedRoles;

    public Role[] getSelectedRoles() {
		return selectedRoles;
	}

	public void setSelectedRoles(Role[] selectedRoles) {
		this.selectedRoles = selectedRoles;
	}

	@PostConstruct
    public void init() {
        newUser = new User();
        selectedUser = new User();
        System.out.println("test");
    }

    public List<Role> getRolesByUser(User user){
    	return roleRepository.findAllByUser(user);
    }
    public String remove(){
    	  try {
              userRegistration.delete(selectedUser);
              FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_INFO, "Deleted!", "Delete successful");
              facesContext.addMessage(null, m);
              init();
          } catch (Exception e) {
              String errorMessage = getRootErrorMessage(e);
              FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, "Delete unsuccessful");
              facesContext.addMessage(null, m);
          }
          return "";
    }
    public String register() throws Exception {
        try {
            userRegistration.register(newUser,selectedRoles);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registered!", "Adding successful");
            facesContext.addMessage(null, m);
            init();
        } catch (Exception e) {
            String errorMessage = getRootErrorMessage(e);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, "Adding unsuccessful");
            facesContext.addMessage(null, m);
        }
        return "";
    }

    private String getRootErrorMessage(Exception e) {
        String errorMessage = "Failed. See server log for more information";
        if (e == null) {
            return errorMessage;
        }

        Throwable t = e;
        while (t != null) {
            errorMessage = t.getLocalizedMessage();
            t = t.getCause();
        }
        return errorMessage;
    }

	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) throws Exception {
		this.selectedUser = selectedUser;
	}

	public User getNewUser() {
		return newUser;
	}

	public void setNewUser(User newUser) {
		this.newUser = newUser;
	}

  	
  	

}
