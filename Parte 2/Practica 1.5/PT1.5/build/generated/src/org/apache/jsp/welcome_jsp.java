package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Patient;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu2.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" \n");
      out.write("        integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>PT1.5</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<div class=\"span12\" align=\"center\" >\n");
      out.write("    <h2>\n");
      out.write("        <a href=\"filter_pac.jsp\">Filtrar</a>\n");
      out.write("        <a href=\"add_pac.jsp\">Afegir Pacient</a>\n");
      out.write("        ");

            String rol = (String) session.getAttribute("rol");
            if (rol.equals("admin")) {
                out.println("<a href='add_user.jsp'>Afegir Usuari de la web</a>");
                out.println("<a href='del_User.jsp'>Esborrar usuari de la web</a>");
            }


        
      out.write("\n");
      out.write("        <a href=\"logout.jsp\">Sortir</a>\n");
      out.write("    </h2>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <tr>\n");
      out.write("                <th> Edat</th>\n");
      out.write("                <th>GrupEdat</th>\n");
      out.write("                <th>Pes</th>\n");
      out.write("                <th>Talla</th>\n");
      out.write("                <th>Imc</th>\n");
      out.write("                <th>Classificacio</th>\n");
      out.write("                <th>Menarquia</th>\n");
      out.write("                <th>Menopausia</th>\n");
      out.write("                <th>Tipus de Menopausia</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                if (request.getAttribute("result") != null) {
                    List<Patient> result = (List<Patient>) request.getAttribute("result");
                    int contador = 0;
                    String linea = "";
                    for (Patient p : result) {
                        if (contador % 2 == 0) {
                            linea = "<tr bgcolor=#DCDCDC>";
                        } else {
                            linea = "<tr bgcolor=yellow>";
                        }
                        out.println(linea + "<th>" + p.getEdat() + "</th>"
                                + "<th>" + p.getGrupEdat() + "</th>"
                                + "<th>" + p.getPes() + "</th>"
                                + "<th>" + p.getTalla() + "</th>"
                                + "<th>" + p.getImc() + "</th>"
                                + "<th>" + p.getClassificacio() + "</th>"
                                + "<th>" + p.getMenarquia() + "</th>"
                                + "<th>" + p.getMenopausia() + "</th>"
                                + "<th>" + p.getTipusMenopausia() + "</th>"
                                + "</tr>");
                        contador++;
                    }
                    out.println("</table>");

                }
            
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
