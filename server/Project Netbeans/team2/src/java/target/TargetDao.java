/* ============================================================================
 * Filename     : TargetDao.java
 * ============================================================================
 * Created on   : 7 august 2013
 * ============================================================================
 * Authors      : Arith K Sharma
 *                Grégoire Decorvet
 *                Nagabharan Nagendran
 *                Thomas Schweizer
 * ============================================================================
 */

package target;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * This class is a data accessor object. Access to "Target" entity.
 * 
 * @author Arith K Sharma
 * @author Grégoire Decorvet
 * @author Nagabharan Nagendran
 * @author Thomas Schweizer
 */
@Stateless
public class TargetDao {

   @PersistenceContext
   private EntityManager em;

   /**
    * Store a new target.
    * @param target - the new target.
    */
   public void persist(Target target) {
      em.persist(target);
   }

   /**
    * Return the list of all targets.
    * @return the list of all targets.
    */
   public List<Target> getAllTargets() {
      TypedQuery<Target> query = em.createQuery(
         "SELECT t FROM Target t ORDER BY t.name",
         Target.class);
      return query.getResultList();
   }

   /**
    * Return a target, choosen randomly.
    * @return a random target.
    */
   public Target getRandomTarget() {
      TypedQuery<Target> query = em.createQuery(
         "SELECT t FROM Target t ORDER BY t.name",
         Target.class);
      
      List<Target> list = query.getResultList();

      Target result = null;
      if (!list.isEmpty()) {
         int randVal = (int) (Math.random() * list.size());
         result = list.get(randVal);
      }

      return result;
   }
   
}