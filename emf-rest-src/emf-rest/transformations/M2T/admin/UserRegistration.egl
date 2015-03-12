package webmapi.admin;


import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import webmapi.model.Role;
import webmapi.model.User;
import webmapi.model.UserRole;

import java.util.List;
import java.util.logging.Logger;


@Stateless
public class UserRegistration {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;
    
    @Inject
    private UserRoleRepository userRoleRepository;
    

    @Inject
    private Event<User> userEventSrc;

    public void register(User user, Role[] selectedRoles) throws Exception {
        log.info("Registering " + user.getUsername());
        em.persist(user);
        for(Role role : selectedRoles){
        	UserRole userRole = new UserRole();
        	userRole.setUser(user);
        	userRole.setRole(role);
        	em.persist(userRole);
        }
        userEventSrc.fire(user);
    }
    public void delete(User user) throws Exception {
    	System.out.println(user);
        log.info("Deleting "+user.getUsername());
        for(UserRole userRole : userRoleRepository.findByUser(user)){
        	em.remove(userRole);
        }
        em.remove(em.contains(user) ? user : em.merge(user));
      
        userEventSrc.fire(user);
    }
}
