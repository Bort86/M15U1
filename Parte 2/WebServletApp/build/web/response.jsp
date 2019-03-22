<%-- 
    Document   : response
    Created on : 12-dic-2018, 18:03:46
    Author     : aasensio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Response JSP Page</title>
    </head>
    <body>
        <%
            if (request.getParameter("nom") != null) {
                out.println(request.getParameter("nom"));
            }
        %>
        <%=request.getParameter("numero")%>
    </body>
</html>
