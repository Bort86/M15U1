<%-- 
    Document   : register
    Created on : 15-ene-2019, 17:50:18
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
        <h1>Register page</h1>
        <%@include file="menu.jsp" %>
        <br/>
        <br/>        
        <form method="post" action="user">
            Username: <input type="text" name="username"/>
            <br/>
            Password: <input type="password" name="password" />
            <br/>
            Repite Password: <input type="password" name="password_repetido" />
            <br/>
            <input type="submit" name="action" value="Register"/>            
        </form>
        
        <%
            
           /*if(request.getParameter("error")!=null){
              //out.println("Usuario y/o contraseña incorrectas");
   
               String error=request.getParameter("error");
               if(error.equals("1")) out.println("Hay problemas con la base de datos de los ficheros");
               if(error.equals("2")) out.println("La contraseña elegida es muy corta, mínimo 4 caracteres");
               if(error.equals("3")) out.println("La contraseña repetida no es igual a la primera contraseña");;
           }*/
           if (request.getAttribute("error")!=null){
               String result = (String) request.getAttribute("error");
               out.println(result);
           }
            
            
            
            
        %>
    </body>
</html>
