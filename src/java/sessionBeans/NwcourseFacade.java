/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entities.Nwcourse;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author s519458
 */
@Stateless
public class NwcourseFacade extends AbstractFacade<Nwcourse> {
    @PersistenceContext(unitName = "GDPProjectSamplePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    
    public void persist(Nwcourse course)
    {
        em.persist(course);
    }
    
    public List<Nwcourse> getCourseRecords()
    {
        Query query= em.createNamedQuery("Nwcourse.findAll");
        return query.getResultList();
        
    }
    
    
    public NwcourseFacade() {
        super(Nwcourse.class);
    }
   
}
