<%-- 
    Document   : index
    Created on : 11-dic-2018, 16:38:56
    Author     : bort
--%>

<%@page import="Index.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 3</title>
    </head>
    <body>
        <h1>Protein conversor </h1>
        <form method="post" action="index.jsp">
            
            <p>Introduce the protein sequence to analize: </p>
            <p><input type="text" name="protein"/></p>
            
            <p>Choose type of protein base you are going to introduce, DNA or RNA: </p>
            <input type="radio" name="radio_protein" value="dna"> DNA<br>
            <input type="radio" name="radio_protein" value="rna"> RNA<br>
            <input type="submit" name ="translate" value="Translate"><br>
            
        </form>

        <%
            if (request.getParameter("translate") != null) {
                
                String radio = request.getParameter("radio_protein");

                String protein;
                

                protein = Validator.validateProtein(request.getParameter("protein"), radio);

                if (protein == "") {
                    out.println("You can only put protein bases: a,t,c,g for DNA; a,r,c,g for RNA");

                } else {
                    ProteinChange exercice = new ProteinChange(protein, radio);
                    out.println("<h3>" + exercice.protChanger() + "</h3>");
                }
            }

        %>

    </body>
</html>
