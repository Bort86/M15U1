/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * MainController para el servlet del ejercicio 2
 *
 * @author Pablo Rodriguez
 */
@WebServlet(name = "MainController", urlPatterns = {"/main"})
public class MainController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("action") != null) {
            String action = request.getParameter("action");
            switch (action) {
                case "Submit Comment":
                    compFormulari(request, response);
                    break;
            }
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    /**
     * compFormulari: Es la función principal donde se recogen los campos de
     * texto del formulario también se printa la página de response con el ok o
     * los fallos específicos
     *
     * @version 1.0
     * @author Pablo Rodriguez
     * @param request
     * @param response
     * @throws IOException
     */
    private void compFormulari(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // recojemos primero todos los campos del formulario
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String sitioweb = request.getParameter("sitioweb");
        String comentario = request.getParameter("comentario");

        HttpSession session = request.getSession();

        if (validarNombre(nombre)) {
            session.setAttribute("nombre", nombre);
        } else {
            session.setAttribute("nombre", "Campo nombre incorrecto");
        }

        if (validarCorreo(correo)) {
            session.setAttribute("correo", correo);
        } else {
            session.setAttribute("correo", "Campo correo incorrecto");
        }

        if (validarSitioweb(sitioweb)) {
            session.setAttribute("sitioweb", sitioweb);
        } else {
            session.setAttribute("sitioweb", "Campo sitioweb incorrecto");
        }

        if (validarComentario(comentario)) {
            session.setAttribute("comentario", comentario);
        } else {
            session.setAttribute("comentario", "Campo comentario incorrecto");
        }
        
        response.sendRedirect("response.jsp");
        
    }

    /**
     * validarNombre, confirma que no esté vacío ni que pase de los 40 chars
     *
     * @author Pablo Rodriguez
     * @param nombre
     * @return resultado true si es ok, false si está mal
     */
    private boolean validarNombre(String nombre) {
        boolean resultado = false;
        if (isNotEmpty(nombre) && char40(nombre)) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * validarCorreo, valida que no esté vacío, que los chars no pasen de 40 y
     * esté bien formateado
     *
     * @author Pablo Rodriguez
     * @param correo
     * @return resultado true si es ok false si está mal
     */
    private boolean validarCorreo(String correo) {
        boolean resultado = false;
        if (isNotEmpty(correo) && char40(correo) && validar_formato_mail(correo)) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * validarSitiobeb, valida que no esté vacío, que los chars no pasen de 40 y
     * esté bien formateado
     *
     * @author Pablo Rodriguez
     * @param sitioweb
     * @return resultado true si es ok false si está mal
     */
    private boolean validarSitioweb(String sitioweb) {
        boolean resultado = false;
        if (isNotEmpty(sitioweb) && char40(sitioweb) && validar_formato_web(sitioweb)) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * validarComentario, valida que no esté vacío, que no pase de 140chars y
     * que no tenga palabras baneadas
     *
     * @author Pablo Rodriguez
     * @param comentario
     * @return resultado true si es ok false si está mal
     */
    private boolean validarComentario(String comentario) {
        boolean resultado = false;

        if (isNotEmpty(comentario) && char140(comentario) && validar_palabrotas(comentario)) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * isNotEmpty, valida que la cadena no esté vacía o sea nula
     *
     * @author Pablo Rodriguez
     * @param cadena
     * @return resultado true si es ok false si está mal
     */
    private boolean isNotEmpty(String cadena) {
        boolean resultado = true;
        if (cadena == "" || cadena == null) {
            resultado = false;
        }

        return resultado;
    }

    /**
     * char40, valida que la cadena no tenga más de 40 chars
     *
     * @author Pablo Rodriguez
     * @param cadena
     * @return resultado true si es ok false si está mal
     */
    private boolean char40(String cadena) {
        boolean resultado = true;
        if (cadena.length() > 40) {
            resultado = false;
        }
        return resultado;
    }

    /**
     * char140, valida que la cadena no tenga más de 140 chars
     *
     * @author Pablo Rodriguez
     * @param cadena
     * @return resultado true si es ok false si está mal
     */
    private boolean char140(String cadena) {
        boolean resultado = true;
        if (cadena.length() > 140) {
            resultado = false;
        }
        return resultado;
    }

    /**
     * validar_formato_mail valida que haga match con un regex de mails
     *
     * @author Pablo Rodriguez
     * @param campo_texto
     * @return resultado true si es ok false si está mal
     */
    private boolean validar_formato_mail(String campo_texto) {
        boolean resultado = false;
        if (Pattern.matches("^.+@.+\\..+$", campo_texto)) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * validar_formato_web valida que haga match con un regex de web
     *
     * @author Pablo Rodriguez
     * @param campo_texto
     * @return resultado true si es ok false si está mal
     */
    private boolean validar_formato_web(String campo_texto) {
        boolean resultado = false;
        if (Pattern.matches("^.+\\..+$", campo_texto)) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * validar_palabrotas, comprueba que un campo de texto no contenga cualquera
     * de las palabras censuradas
     *
     * @author Pablo Rodriguez
     * @param campo_texto
     * @return resultado true si es ok false si está mal
     */
    private boolean validar_palabrotas(String campo_texto) {
        boolean resultado = true;
        String[] palabrotas = new String[]{"tonto", "burro", "capullo", "zoquete", "alcornoque", "looser"};
        for (int i = 0; i < palabrotas.length; i++) {
            if (campo_texto.contains(palabrotas[i])) {
                resultado = false;
            }

        }
        return resultado;
    }

}
