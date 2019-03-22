<%-- 
    Document   : index
    Created on : Dec 19, 2018, 3:39:25 PM
    Author     : alumne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login page</h1>
        <%@include file="menu.jsp" %>
        
       
        <br/>
        <br/>
        
        <form method="post" action="user">
            Username: <input type="text" name="username"/>
            <br/>
            Password: <input type="password" name="password" />
            <br/>
            <input type="submit" name="action" value="Validate"/>
                        
        </form>
        
        
        
        <%
            
           if(request.getParameter("error")!=null){
              //out.println("Usuario y/o contraseña incorrectas");
   
               String error=request.getParameter("error");
               if(error.equals("1")) out.println("Usuario y/o contraseña incorrectas");
           } 

        %>
    </body>
</html>
