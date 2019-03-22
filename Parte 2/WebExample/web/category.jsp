<%@page import="model.Category"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="html/menu.html"/>

<h1>Category</h1>

<% 
    if(request.getAttribute("listado")!=null){
        List<Category> categorias = (List<Category>)request.getAttribute("listado");
        
        for (Category cat : categorias){
            out.println(cat.toString());
            out.println("<br/>");
        }
    
}
%>
<jsp:include page="html/footer.html"/>