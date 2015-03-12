
package webmapi.admin;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import webmapi.model.Role;
import webmapi.model.User;

import java.util.List;


@ApplicationScoped
public class RoleRepository {

    @Inject
    private EntityManager em;

    public Role findById(Long id) {
        return em.find(Role.class, id);
    }

    public List<Role> findAllByUser(User user) {
     return em.createNamedQuery("role.findAllByUser",Role.class).setParameter("user", user).getResultList();
    }
    public List<Role> findAllRoles() {
    	  CriteriaBuilder cb = em.getCriteriaBuilder();
          CriteriaQuery<Role> criteria = cb.createQuery(Role.class);
          Root<Role> role = criteria.from(Role.class);
          
          return em.createQuery(criteria).getResultList();
       }
       
    

}
