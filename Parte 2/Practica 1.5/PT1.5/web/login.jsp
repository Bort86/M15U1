<%-- 
    Document   : login
    Created on : 30-ene-2019, 16:46:00
    Author     : Pablo Rodriguez
--%>

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
        <title>Login Page</title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <h3>Login Page</h3>

        <form method="post" action="controller">
            Username: <input type="text" name="username"/>
            <br/>
            Password: <input type="password" name="password" />
            <br/>
            <input type="submit" name="action" value="login"/>

        </form>


        <%

            if (request.getParameter("error") != null) {
                String error = request.getParameter("error");
                if (error.equals("1")) {
                    out.println("Usuario y/o contraseña incorrectas");
                }
            }


        %>
    </div>
</body>
</html>
