<%-- 
    Document   : e2
    Created on : Nov 28, 2018, 5:18:04 PM
    Author     : aasensio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="util.Util"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercice 2</title>
    </head>
    <body>
        <h1>Exercice 2</h1>
        <p>
            2. Escriu un programa que ens deixi introduir una seqüència d'ADN i 
            ens digui si estem davant d'una repetició invertida (palíndroms)
            del fragment d'ADN. Deixarem introduir la seqüència original fent 
            servir majúscules o minúscules, també admetrem espais en blanc.
        </p>
        <form method="post">
            <label>Type a DNA sequence: </label>
            <input type="text" name="seq">
            <input type="submit" name="send">
        </form>
        <%
            if (request.getParameter("send") != null) {
                String seq = request.getParameter("seq");
                //és comprovar que sigui una fragment d'ADN
                seq = Util.clean(seq);
                String result = Util.isPalindromicDna(seq) ? "palindromic" : "non-palindromic";
                out.println(String.format("<p>Your DNA sequence is %s.</p>", result));
            }
        %>
    </body>
</html>
