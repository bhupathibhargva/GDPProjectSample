/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entities.StuRecord;
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
public class StuRecordFacade extends AbstractFacade<StuRecord> {
    @PersistenceContext(unitName = "GDPProjectSamplePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

     public void persist(StuRecord record)
    {
        em.persist(record);
    }
    
    public List<StuRecord> getCourseRecords()
    {
        Query query= em.createNamedQuery("StuRecord.findAll");
        return query.getResultList();
        
    }
    
    public StuRecordFacade() {
        super(StuRecord.class);
    }
    
}
