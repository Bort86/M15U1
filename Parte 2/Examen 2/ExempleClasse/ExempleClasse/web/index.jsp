<%-- 
    Document   : index
    Created on : Nov 13, 2018, 4:17:45 PM
    Author     : alumne
--%>

<%@page import="index.Validation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="index.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>I.M.C.</title>
    </head>
    <body>
       
        <h1>Anem a calcular l'Index de Massa Corporal</h1>
        <form method="post" action="index.jsp">
            Pes (en kilograms):<input type="text" name="pes" />
            <br/>
            Alçada (en metres)<input type="text" name="alsada" />
            <br/>
            <input type="submit" name="ok" value="Enviar"/>
        </form>  
       
        <%
           
            //si ha clicat o no al botó del formulari
           if(request.getParameter("ok")!=null) {
              
              double pes, alsada;
              //debería validar los valores de mis cajas
              //según lo entrado, me debería salir o no un resultado
              //crear una clase de validacion
              
              pes=Validation.validaDouble(request.getParameter("pes"));
              alsada=Validation.validaDouble(request.getParameter("alsada"));
             
              if(pes <0 || alsada <0){
                  out.println("Has d'introduir números positius");
              }else{
                Imc indice=new Imc(pes,alsada);

                out.println("El teu Index de massa corporal és de: <br/>");
                out.println(String.format("%.2f", indice.calculaImc()));
                out.println(indice.comEstas());
              }
           }
           
        %>
        
    </body>
</html>
