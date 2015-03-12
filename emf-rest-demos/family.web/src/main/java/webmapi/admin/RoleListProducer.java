package webmapi.admin;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import webmapi.model.Role;
import webmapi.model.User;

import java.util.List;


@ApplicationScoped
public class RoleListProducer {

    @Inject
    private RoleRepository roleRepository;

    private List<Role> roles;
    
    

    @Produces
    @Named
    public List<Role> getRoles() {
        return roles;
    }

    

    @PostConstruct
    public void retrieveAllUsersOrderedByUsername() {
        roles = roleRepository.findAllRoles();
    }
}
