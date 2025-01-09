<%-- 
    Document   : home
    Created on : Jan 9, 2025, 8:44:23 AM
    Author     : OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
             <%
        if (session == null || session.getAttribute("user") == null) {
            response.sendRedirect("login.jsp");
        } else {
            String username = (String) session.getAttribute("user");
    %>
            <h2>Welcome, <%= username %></h2>
            <a href="LogoutServlet">Logout</a>
    <%
        }
    %>
    </body>
</html>
