<%-- 
    Document   : response
    Created on : 30-ene-2019, 18:21:27
    Author     : Pablo Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <title>Ejercicio2</title>
    </head>
    <body>
        <%
            out.println("<br/>" + session.getAttribute("nombre"));
            out.println("<br/>" + session.getAttribute("correo"));
            out.println("<br/>" + session.getAttribute("sitioweb"));
            out.println("<br/>" + session.getAttribute("comentario"));
            
            
        %>
    </body>
</html>
