package webmapi.admin;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import webmapi.model.User;

import java.util.List;


@ApplicationScoped
public class UserRepository {

    @Inject
    private EntityManager em;

    public User findById(Long id) {
        return em.find(User.class, id);
    }

    public User findByUsername(String username) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> criteria = cb.createQuery(User.class);
        Root<User> user = criteria.from(User.class);
        
        criteria.select(user).where(cb.equal(user.get("username"), username));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<User> findAllOrderedByUsername() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> criteria = cb.createQuery(User.class);
        Root<User> user = criteria.from(User.class);
       
        criteria.select(user).orderBy(cb.asc(user.get("username")));
        return em.createQuery(criteria).getResultList();
    }
}
