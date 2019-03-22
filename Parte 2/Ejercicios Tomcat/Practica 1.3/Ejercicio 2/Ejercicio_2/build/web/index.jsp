<%-- 
    Document   : index
    Created on : 28-nov-2018, 17:18:45
    Author     : bort
--%>

<%@page import="Index.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 2</title>
    </head>
    <body>
        <h1>Check palindromic DNA sequences</h1>
        <form method="post" action="index.jsp">
            <p>Introduce the dna sequence to analize: </p>
            <p><input type="text" name="DNA"/></p>
            <input type="submit" name="checkdna" value="Check" />
        </form>

        <%
            if (request.getParameter("checkdna") != null) {

                String dna;

                dna = Validation.validateDNA(request.getParameter("DNA"));

                if (dna == "") {
                    out.println("You can only put dna bases: a,t,c,g");
                    
                } else {

                    ReverseComplementary dna_seq = new ReverseComplementary(dna);
                    if (dna.equals(dna_seq.reverseDna())) {
                        out.println("<h2>Son palindrómicas</h2>");

                    } else {
                        out.println("<h2>No son palindrómicas</h2>");
                    }
                }
            }

        %>

    </body>
</html>
