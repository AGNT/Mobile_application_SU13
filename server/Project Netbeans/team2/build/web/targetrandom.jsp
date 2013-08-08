<%-- 
    Document   : targetrandom
    Created on : 7 august 2013
    Authors    : Arpith K Sharma
                 Grégoire Decorvet
                 Nagabharan Nagendran
                 Thomas Schweizer
--%><%@page contentType="text/plain; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%><%@page import="java.util.*,target.Target"%><% @SuppressWarnings("unchecked") Target target = (Target) request.getAttribute("random");if (target != null) {%><%= target%> <%}%>