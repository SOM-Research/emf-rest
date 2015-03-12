package webmapi.admin;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.inject.Named;

import webmapi.model.Role;

	@Named
	public class RoleConverter implements Converter {

@Inject RoleRepository roleRepository;

	    public Object getAsObject(FacesContext facesContext, UIComponent component, String submittedValue) {
	        if (submittedValue.trim().equals("")) {
	            return null;
	        } else {
	            try {
	                Long number = Long.parseLong(submittedValue);
	                Role b =roleRepository.findById(number);
	return b;
	                }
	                
	             catch(NumberFormatException exception) {
	                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid role"));
	            }
	        }

	      
	    }

	    public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
	        if (value == null || value.equals("")) {
	            return "";
	        } else {
	            return String.valueOf(((Role) value).getId());
	        }
	    }
	}
