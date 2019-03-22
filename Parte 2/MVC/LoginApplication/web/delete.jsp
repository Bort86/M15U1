<%-- 
    Document   : delete
    Created on : 22-ene-2019, 18:05:22
    Author     : Pablo Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Delete page</h1>
        <%@include file="menu.jsp" %>
        <br/>
        <br/>
        
         <form method="post" action="user">
            Introduce Username you want to delete: <input type="text" name="username"/>
            <br/>
            
            <input type="submit" name="action" value="Delete"/>
                        
        </form>
    </body>
</html>
