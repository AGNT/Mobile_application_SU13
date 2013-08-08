<%-- 
    Document   : target
    Created on : 7 august 2013
    Authors    : Arpith K Sharma
                 Grégoire Decorvet
                 Nagabharan Nagendran
                 Thomas Schweizer
--%>

<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,target.Target"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
   <head>
      <title>AGNT targets</title>
   </head>

   <body>
      <form method="POST" action="target">
         Name: <input type="text" name="name" />
         Latitude : <input type="text" name="latitude" />
         Longitude: <input type="text" name="longitude" />
         <input type="submit" value="Add" />
      </form>

      <hr>
      <ol> <%
         List<Target> targets = (List<Target>) request.getAttribute("targets");
         if (targets != null) {
            for (Target target : targets) {%>
               <li> <%= target%> </li> <%
            }
         }%>
      </ol>
      
   </body>
</html>