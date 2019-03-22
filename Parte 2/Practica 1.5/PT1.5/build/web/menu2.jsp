<div class="span12" align="center" >
    <h2>
        <a href="filter_pac.jsp">Filtrar</a>
        <a href="add_pac.jsp">Afegir Pacient</a>
        <%
            String rol = (String) session.getAttribute("rol");
            if (rol.equals("admin")) {
                out.println("<a href='add_user.jsp'>Afegir Usuari de la web</a>");
                out.println("<a href='del_User.jsp'>Esborrar usuari de la web</a>");
            }


        %>
        <a href="logout.jsp">Sortir</a>
    </h2>
</div>