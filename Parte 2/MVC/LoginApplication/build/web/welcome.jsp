<%-- 
    Document   : welcome
    Created on : Dec 19, 2018, 4:17:45 PM
    Author     : alumne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h1>Welcome page</h1>
        <%@include file="menu.jsp" %>
        <br/>
        <br/>
        <%
            if(session.getAttribute("name")==null){
                response.sendRedirect("index.jsp");
            }
         %>
            Hello <%=session.getAttribute("name")%>
            
            
    </body>
</html>
