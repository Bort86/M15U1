<%-- 
    Document   : welcome
    Created on : Dec 18, 2018, 4:42:29 PM
    Author     : alumne
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%=session.getAttribute("numero")%>
        <%
           if(session.getAttribute("nom")!=null){
               out.println("<br/>"+session.getAttribute("nom"));
           }
           
           if(session.getAttribute("list")!=null){
               List<String> llistatdeCapitals= (List<String>)session.getAttribute("list");
               for(String capital:llistatdeCapitals){
                   out.println("<br/>"+capital);
               }
               
               
           }

         %>
    </body>
</html>
