<%-- 
    Document   : add_pac
    Created on : 05-feb-2019, 16:50:39
    Author     : Pablo Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PT 1.5 Añadir paciente</title>
    </head>
    <body>
        <%@include file="menu2.jsp"%>
        <h1>Añadir paciente</h1>
        <form method="post" action="controller">
            <p>Edad: <input type="text" name="edad"/></p>
            <p>Grupo Edad: 
                <select name='grupoEdad'>
                    <option value='FINS A 45'>fins a 45</option>
                    <option value='45-49'>45-49</option>
                    <option value='50-54'>50-54</option>
                    <option value='55-59'>55-59</option>
                    <option value='60-64'>60-64</option>
                    <option value='65-69'>65-69</option>
                    <option value="MÉS DE 69">més de 69</option>
                </select>
            </p>
            <p>Peso: <input type="text" name="peso"/></p>
            <p>Talla: <input type="text" name="talla"/></p>
            <p>Classificació 
                <select name='classificacio'>
                    <option value='OSTEOPENIA'>Osteopenia</option>
                    <option value='NORMAL'>Normal</option>
                    <option value='OSTEOPOROSI'>Osteoporosi</option>
                </select>
            </p>
            <p>Menarquia: <input type="text" name="menarquia"/></p>
            <p>Menopausia: 
                <input type="radio" name="Menopausia" value="SI" checked="checked"> Sí
                <input type="radio" name="Menopausia" value="NO"> No
            </p>
            <p>Tipus de menopausia:
                <select name='tipusMenopausia'>
                    <option value='NO CONSTA'>no consta</option>
                    <option value='NATURAL'>natural</option>
                    <option value='OVARIECTOMIA'>ovariectomia</option>
                    <option value='HISTEROCTOMIA'>histeroctomia</option>
                    <option value='AMBDUES'>ambdues</option>
                </select>                
            </p>
            <input type="submit" name="action" value="Añadir Paciente"/>
        </form>
        
        <% if (request.getAttribute("result_addPat")!= null){
            String result = (String)request.getAttribute("result_addPat");
            out.println("<p>"+ result + "</p>");
        }
            %>
    </body>
</html>
