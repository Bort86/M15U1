<%-- 
    Document   : index
    Created on : 12-dic-2018, 11:40:56
    Author     : bort
--%>

<%@page import="Index.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio4</title>
    </head>
    <body>
        <h1>Nucleotids to Aminoacids conversor</h1>
        <form method="post" action="index.jsp">
            <p>Introduce the Nucleotids chain to analize: </p>
            <p><input type="text" name="nucleotid"/></p>

            <p><input type="submit" name ="translate" value="Translator"></p><br>
        </form>

        <%
            if (request.getParameter("translate") != null) {

                String nucleotid = "";
                
                nucleotid = Validator.validateNucleotid(request.getParameter("nucleotid"));
                
                if (nucleotid == "") {
                    out.println("You have introduced a wrong nucleotid");
                } else {
                    Amino amino = new Amino (nucleotid);
                    out.println("<h3>" + amino.getAmino() + "</h3>");
                }
                
                
            }
        %>

    </body>
</html>
