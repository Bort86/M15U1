<%-- 
    Document   : welcome
    Created on : 30-ene-2019, 17:08:28
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
        <title>PT1.5</title>
    </head>
    <body>
        <%@include file="menu2.jsp"%>
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
                if (request.getAttribute("result") != null) {
                    List<Patient> result = (List<Patient>) request.getAttribute("result");
                    int contador = 0;
                    String linea = "";
                    for (Patient p : result) {
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
            %>

    </body>
</html>
