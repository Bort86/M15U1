<%-- 
    Document   : index.jsp
    Created on : 29-ene-2019, 16:53:50
    Author     : Pablo Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <c:redirect  url = "/patientController?action=indexar" />

        
    </body>
</html>
