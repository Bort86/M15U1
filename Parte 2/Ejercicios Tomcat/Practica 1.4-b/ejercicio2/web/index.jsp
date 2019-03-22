<%-- 
    Document   : index
    Created on : 30-dic-2018, 17:38:30
    Author     : Pablo Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <title>Exercici2: Validació d'un formulari</title>
    </head>
    <body>
        <form method="post" action="MainController" id="usrform">
            <h1>Escribe un comentario</h1>

            <p> <input type="text" name="nombre"/>Nombre (requerido)</p>
            <p> <input type="text" name="correo"/>E-mail (no será publicado) (requerido)</p>
            <p> <input type="text" name="sitioweb"/>Sitio Web</p>
            <p> <textarea rows="4" cols="50" name="comentario" form="usrform"></textarea></p>
            <br>
            <input type="submit" name="action" value="Submit Comment"/>
        </form>
    </body>
</html>
