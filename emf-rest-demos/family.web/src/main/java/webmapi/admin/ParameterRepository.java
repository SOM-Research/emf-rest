package webmapi.admin;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import webmapi.model.Parameter;

import java.util.List;


@Stateless
public class ParameterRepository {

    @Inject
    private EntityManager em;
    
    @Inject
    private Event<Parameter> paramEventSrc;

    public Parameter findById(Long id) {
        return em.find(Parameter.class, id);
    }

    public void save(Parameter parameter) {
        em.merge(parameter);
        paramEventSrc.fire(parameter);
    }

    
}
