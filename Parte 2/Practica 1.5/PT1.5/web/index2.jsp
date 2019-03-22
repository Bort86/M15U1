<%-- 
    Document   : index2
    Created on : 29-ene-2019, 16:59:25
    Author     : Pablo Rodriguez
--%>

<%@page import="model.Patient"%>
<%@page import="java.util.List"%>
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
        <title>Index2 Page</title>
    </head>
    <body>
        <%@include file="menu.jsp"%>

        <table class="table">
            <tr>
                <th>GrupEdat</th>
                <th>Pes</th>
                <th>Imc</th>
                <th>Classificacio</th>
            </tr>
            <%
                List<Patient> result = (List<Patient>) request.getAttribute("result");
                int contador = 0;
                String linea = "";
                for (Patient p : result) {
                    if (contador % 2 == 0) {
                        linea = "<tr bgcolor=#DCDCDC>";
                    } else {
                        linea = "<tr bgcolor=yellow>";
                    }
                    out.println(linea + "<th>" + p.getGrupEdat() + "</th><th>" + p.getPes() + "</th><th>" + p.getImc() + "</th><th>" + p.getClassificacio() + "</th></tr>");
                    contador++;
                }


            %>
        </table>


    </body>
</html>
