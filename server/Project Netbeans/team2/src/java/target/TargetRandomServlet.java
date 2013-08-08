/* ============================================================================
 * Filename     : TargetRandomServlet.java
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

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class manage the client requests for the random target page.
 * 
 * @author Arith K Sharma
 * @author Grégoire Decorvet
 * @author Nagabharan Nagendran
 * @author Thomas Schweizer
 */
@WebServlet(name = "TargetRandomServlet", urlPatterns = {"/target/random"})
public class TargetRandomServlet extends HttpServlet {

   private static final long serialVersionUID = 2L;
   
   @EJB
   TargetDao targetDao;

   @Override
   protected void doGet(
           HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      
      request.setAttribute("random", targetDao.getRandomTarget());
      request.getRequestDispatcher("/targetrandom.jsp").forward(request, response);
   }
}