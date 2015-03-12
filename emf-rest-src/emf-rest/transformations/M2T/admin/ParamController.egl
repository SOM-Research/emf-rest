
package webmapi.admin;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import webmapi.model.Parameter;

@Named
@ApplicationScoped
public class ParamController {

	
	@Inject
    private FacesContext facesContext;

    @Inject
    private EntityManager em;

   
private Parameter validation;


	@PostConstruct
    public void init() {
        validation = em.find(Parameter.class, new Long(1));
    }

    

    public String save() throws Exception {
        try {
            em.persist(validation);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved", "update successful");
            facesContext.addMessage(null, m);
            init();
        } catch (Exception e) {
            String errorMessage = getRootErrorMessage(e);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, "Update unsuccessful");
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



	public Parameter getValidation() {
		return validation;
	}



	public void setValidation(Parameter validation) {
		this.validation = validation;
	}

	
  	

}
