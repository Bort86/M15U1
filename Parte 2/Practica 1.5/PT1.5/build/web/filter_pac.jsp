<%-- 
    Document   : filter_pac
    Created on : 05-feb-2019, 16:50:28
    Author     : Pablo Rodriguez
--%>

<%@page import="java.util.List"%>
<%@page import="model.Patient"%>
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
        <title>PT 1.5 Filtrar paciente</title>
    </head>
    <body>
        <%@include file="menu2.jsp"%>
        <h1>Find me some pacients, boy!</h1>
        <form method="post" action="controller">

            Classificació: 
            <select name='classificacio'>
                <option value='OSTEOPENIA'>Osteopenia</option>
                <option value='NORMAL'>Normal</option>
                <option value='OSTEOPOROSI'>Osteoporosi</option>
            </select>
            <br/>

            Menopausia: 
            <input type="radio" name="Menopausia" value="SI" checked="checked"> Sí
            <input type="radio" name="Menopausia" value="NO"> No
            <br/>

            tipusMenopausia:  
            <select name='tipusMenopausia'>
                <option value='NO CONSTA'>no consta</option>
                <option value='NATURAL'>natural</option>
                <option value='OVARIECTOMIA'>ovariectomia</option>
                <option value='HISTEROCTOMIA'>histeroctomia</option>
                <option value='AMBDUES'>ambdues</option>
            </select>
            <br/>

            <input type="submit" name="action" value="Filtrar"/>
        </form>
        
        <table class="table">
            <tr>
                <th> Edat</th>
                <th>GrupEdat</th>
                <th>Pes</th>
                <th>Talla</th>
                <th>Imc</th>
                <th>Classificacio</th>
                <th>Menarquia</th>
                <th>Menopausia</th>
                <th>Tipus de Menopausia</th>
            </tr>
        <%            
            if (request.getAttribute("result_filt") != null) {
                List<Patient> result_filt = (List<Patient>) request.getAttribute("result_filt");
                if (result_filt.isEmpty()) {
                    out.println("</table>");
                    out.println("<h1>No hi ha cap coincidencies</h1>");
                    
                } else {
                    int contador = 0;
                    String linea = "";
                    for (Patient p : result_filt) {
                        if (contador % 2 == 0) {
                            linea = "<tr bgcolor=#DCDCDC>";
                        } else {
                            linea = "<tr bgcolor=yellow>";
                        }
                        out.println(linea + "<th>" + p.getEdat() + "</th>"
                                + "<th>" + p.getGrupEdat() + "</th>"
                                + "<th>" + p.getPes() + "</th>"
                                + "<th>" + p.getTalla() + "</th>"
                                + "<th>" + p.getImc() + "</th>"
                                + "<th>" + p.getClassificacio() + "</th>"
                                + "<th>" + p.getMenarquia() + "</th>"
                                + "<th>" + p.getMenopausia() + "</th>"
                                + "<th>" + p.getTipusMenopausia() + "</th>"
                                + "</tr>");
                        contador++;
                    }
                    out.println("</table>");
                }
            }
        %>
        
    </body>
</html>
