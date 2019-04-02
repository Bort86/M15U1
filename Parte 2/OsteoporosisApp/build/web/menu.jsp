<nav class="navbar sticky-top navbar-light bg-light">
    <a class="navbar-brand" href="index.jsp">
        <img src="images/icon-bone.png" width="72" height="72" class="d-inline-block align-middle" alt="icon-bone">
        Osteoporosis
    </a>
    <nav class="nav nav-pills flex-column flex-sm-row">
        <%
            StringBuilder links = new StringBuilder();
            if (session.getAttribute("username") == null) {
                links.append("<a class='flex-sm-fill text-sm-center nav-link active' href='login.jsp'>Login</a>");
            } else {
                links.append("<a class='flex-sm-fill text-sm-center nav-link' href='patient?action=form_filterpatient'>Filter patients</a>");
                links.append("<a class='flex-sm-fill text-sm-center nav-link' href='patient?action=form_addpatient'>Add patient</a>");
                if (session.getAttribute("userrole").equals("admin")) {
                    links.append("<a class='flex-sm-fill text-sm-center nav-link' href='user?action=form_adduser'>Add user</a>");
                    links.append("<a class='flex-sm-fill text-sm-center nav-link' href='user?action=form_deleteuser'>Delete user</a>");
                }
                links.append("<a class='flex-sm-fill text-sm-center nav-link disabled' href='user?action=logout'>Logout</a>");
            }
            out.println(links.toString());
        %>
    </nav>
</nav>
