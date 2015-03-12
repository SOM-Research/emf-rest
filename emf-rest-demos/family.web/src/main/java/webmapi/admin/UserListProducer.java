package webmapi.admin;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import webmapi.model.Role;
import webmapi.model.User;

import java.util.List;


@RequestScoped
public class UserListProducer {

    @Inject
    private UserRepository userRepository;

    private List<User> users;
    
    

    @Produces
    @Named
    public List<User> getUsers() {
        return users;
    }

    public void onUserListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final User user) {
    	retrieveAllUsersOrderedByUsername();
    }

    @PostConstruct
    public void retrieveAllUsersOrderedByUsername() {
        users = userRepository.findAllOrderedByUsername();
    }
}
