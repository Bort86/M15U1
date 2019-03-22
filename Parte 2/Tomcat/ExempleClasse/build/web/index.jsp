<%-- 
    Document   : index
    Created on : 13-nov-2018, 17:17:46
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

        <h1>Calcularemos índice de masa corporal</h1>
        <form method="post" action="index.jsp">
            <p>Introduzca su peso en kg</p><input type="text" name="peso" />
            <br/>
            <p>Introduzca su altura en metros</p><input type="text" name="altura" />
            <br/>
            <input type="submit" name="ok" value="Enviar" />

        </form>
        <%
            //si ha clickado o no el botón del formulario
            if (request.getParameter("ok") != null) {
                //iniciamos las variables
                double peso;
                double altura;

                //debería validar los valores de la caja
                //según lo entrad, me debería salir un resultado o no
                //crear una clase de validación
                peso = Validation.validaDoubles(request.getParameter("peso"));
                altura = Validation.validaDoubles(request.getParameter("altura"));

                if (peso < 0 || altura < 0) {
                    out.println("Has de introducir solo números positivos");
                    
                } else {

                    Imc indice = new Imc(peso, altura);

                    //calculamos el resultado y lo printamos por pantalla
                    out.println(String.format("%.2f", indice.calculateImc()));
                    out.println(indice.comoEstas());

                }

            }
        %>

    </body>
</html>
