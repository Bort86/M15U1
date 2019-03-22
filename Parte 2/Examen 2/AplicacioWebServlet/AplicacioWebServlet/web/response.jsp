<%-- 
    Document   : response
    Created on : Dec 12, 2018, 5:03:39 PM
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
        <%
          //les variables es recullen 
          //amb request.getParameter si envies per opció A 
                      
        %>
        <!-- Si envio per Opcio B-->
        
        <%=//request.getAttribute("numero")%>
        <%
            /*
           if(request.getAttribute("nom")!=null){
               out.println("<br/>"+session.getAttribute("nom"));
           }
           
           if(request.getAttribute("list")!=null){
               List<String> llistatdeCapitals= (List<String>)request.getAttribute("list");
               for(String capital:llistatdeCapitals){
                   out.println("<br/>"+capital);
               }
               
               
           }
*/
         %>
         
         <!-- Si envio per Opcio C -->
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
