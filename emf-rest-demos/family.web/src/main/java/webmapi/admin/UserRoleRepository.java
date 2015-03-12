package webmapi.admin;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import webmapi.model.User;
import webmapi.model.UserRole;

import java.util.List;


@ApplicationScoped
public class UserRoleRepository {

    @Inject
    private EntityManager em;

    public UserRole findById(Long id) {
        return em.find(UserRole.class, id);
    }

    public List<UserRole> findByUser(User user) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserRole> criteria = cb.createQuery(UserRole.class);
        Root<UserRole> userRole = criteria.from(UserRole.class);
        
        criteria.select(userRole).where(cb.equal(userRole.get("user"), user));
        return em.createQuery(criteria).getResultList();
    }

   
}
