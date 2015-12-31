/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entities.Mappingtable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author s519458
 */
@Stateless
public class MappingtableFacade extends AbstractFacade<Mappingtable> {
    @PersistenceContext(unitName = "GDPProjectSamplePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MappingtableFacade() {
        super(Mappingtable.class);
    }
    
}
