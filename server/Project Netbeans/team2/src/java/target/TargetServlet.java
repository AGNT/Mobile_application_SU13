/* ============================================================================
 * Filename     : TargetServlet.java
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
 * This class manage the client requests for the target page.
 * 
 * @author Arith K Sharma
 * @author Grégoire Decorvet
 * @author Nagabharan Nagendran
 * @author Thomas Schweizer
 */
@WebServlet(name = "TargetServlet", urlPatterns = {"/target"})
public class TargetServlet extends HttpServlet {

   private static final long serialVersionUID = 3L;
   
   @EJB
   TargetDao targetDao;

   @Override
   protected void doGet(
           HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

      request.setAttribute("targets", targetDao.getAllTargets());
      request.getRequestDispatcher("/target.jsp").forward(request, response);
   }

   @Override
   protected void doPost(
           HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      
      String name = request.getParameter("name");
      Double latitude = null;
      Double longitude = null;
      try {
         latitude = Double.parseDouble(request.getParameter("latitude"));
         longitude = Double.parseDouble(request.getParameter("longitude"));
      }
      catch(NullPointerException e) { }
      catch(NumberFormatException e) { }
      if (name != null && !name.isEmpty()
          && latitude != null && longitude != null) {
         targetDao.persist(new Target(name, latitude, longitude));
      }
      
      // Refresh the list
      doGet(request, response);
   }
   
}