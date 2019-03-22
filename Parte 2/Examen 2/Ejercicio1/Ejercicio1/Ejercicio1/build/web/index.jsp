<%-- 
    Document   : index
    Created on : 20-nov-2018, 17:25:08
    Author     : bort
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Index.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejercicio1</h1>
        <form method="post" action="index.jsp">
            <p>Introduzca su nombre</p>
            <input type="text" name="nombre" />
            <br/>
            <input type="submit" name="formulari" value="Enviar"/>

        </form>

        <%
            if (request.getParameter("formulari") != null) {

                String nombre;

                nombre = request.getParameter("nombre");

                Rewrite_n nombre_nuevo = new Rewrite_n(nombre);

                out.println(String.format("<p>%s</p>", nombre_nuevo.formatName()));
                
                out.println(String.format("<p>%s</p>", nombre_nuevo.contLetters()));
            }

        %>
    </body>
</html>
