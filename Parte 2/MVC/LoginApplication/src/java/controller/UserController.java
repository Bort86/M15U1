/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserDAO;

/**
 *
 * @author alumne
 */
@WebServlet(name = "UserController", urlPatterns = {"/user"})
public class UserController extends HttpServlet {

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
                case "Validate":
                    login(request, response);
                    break;
                case "Register":
                    register(request, response);
                    break;
                case "Delete":
                    delete(request, response);
                    break;
            }

        } else {
            response.sendRedirect("index.jsp");
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //recogemos desde el formulario
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //le pasamos los valores al constructor
        User u = new User(username, password);

        //paso 1: llamar a UserDAO
        //calcula el path para llegar a WEB-INF
        String ruta = getServletContext().getRealPath("/WEB-INF");
        UserDAO udao = new UserDAO(ruta);

        //UserDAO comprobaría si está o no y se lo diría al controlador
        if (udao.findOne(u)) {

            //crear una variable de sesion
            HttpSession session = request.getSession();
            session.setAttribute("name", username);

            response.sendRedirect("welcome.jsp");

        } else {

            response.sendRedirect("login.jsp?error=1");
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

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        /*errores: 
        problemas con el fichero
        contraseña corta
        contraseña no es igual a repite contraseña
         */
        String messages = "";
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // String password_repetido = request.getParameter("password_repetido");

        //1 comprobación: password repetido no igual a password
        /*if (!password.equals(password_repetido)){
            response.sendRedirect("register.jsp?error=3");
        } else 
        
        //2 comprobación: password ha de ser más grande de 4 chars
        if (password.length()<4){
            response.sendRedirect("register.jsp?error=2");
        }*/
        User u = new User(username, password);

        String ruta = getServletContext().getRealPath("/WEB-INF");
        UserDAO udao = new UserDAO(ruta);

        int returned = udao.addUser(u);

        if (returned == -1) {
            messages = "El usuario ya existe";
        }
        if (returned == 0) {
            messages = "Problemas con el fichero";
        }
        if (returned == 1) {
            messages = "Usuario insertado correctamente";
        }

        request.setAttribute("error", messages);
        RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
        rd.forward(request, response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String username = request.getParameter("username");
        if (!username.equals("")) {
            String ruta = getServletContext().getRealPath("/WEB-INF");
            UserDAO udao = new UserDAO(ruta);
            udao.deleteUser(username);
        } else {
            response.sendRedirect("delete.jsp");
        }
    }

}
