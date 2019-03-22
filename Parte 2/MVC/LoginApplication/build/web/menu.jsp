<a href="index.jsp"> Home</a>
<% if(session.getAttribute("name")==null){
    out.println("<a href='login.jsp'> Login</a>");
    out.println("<a href='register.jsp'>Register</a>");
} else {
    out.println("<a href='logout.jsp'> Log Out</a>");
    out.println("<a href='delete.jsp'> Delete User </a>");
    out.println("<a href='modify.jsp'> Modify User </a>");
}%>


