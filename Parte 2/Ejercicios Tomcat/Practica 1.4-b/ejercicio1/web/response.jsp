<%-- 
    Document   : response
    Created on : 02-ene-2019, 20:05:34
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
        <title>Ejercicio1</title>
    </head>
    <body>
        <form method="post" action="MainController" >
            <%
                out.println("JUGADOR " + session.getAttribute("first_player") + " Tirada #" + session.getAttribute("num_jugadas") + ": ");
                out.println("<input type='number' name='eleccion1'/>");
                out.println(session.getAttribute("comprobar1"));
                out.println("<br>");
                out.println("JUGADOR " + session.getAttribute("second_player") + " Tirada #" + session.getAttribute("num_jugadas") + ": ");
                out.println("<input type='number' name='eleccion2'/>");
                out.println("<input type='submit' name='action' value='Tirar'/>");
                out.println(session.getAttribute("comprobar1"));
                out.println("<br>");
               // out.println(session.getAttribute("numero_aleatori"));
               }
            %>
        </form>
    </body>
</html>
