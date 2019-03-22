package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pablo Rodriguez
 */
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
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
                case "Empezar":
                    empezarJuego(request, response);
                    break;
                case "Tirar":
                    jugarMastermind(request, response);
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
     * empezarJuego, se establece el número aleatorio y el jugador que empieza
     * también se inicializa el núm de jugadas
     * @author Pablo Rodriguez
     * @param request
     * @param response
     * @throws IOException 
     */
    private void empezarJuego(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int number_digits = 4;
        int numero_aleatori = numero_aleatori(number_digits);
        int first_player = primer_torn();
        int second_player;

        if (first_player > 1) {
            second_player = 1;
        } else {
            second_player = 2;
        }

        HttpSession session = request.getSession();
        session.setAttribute("first_player", first_player);
        session.setAttribute("second_player", second_player);
        session.setAttribute("numero_aleatori", numero_aleatori);
        session.setAttribute("num_jugadas", 1);
        
        response.sendRedirect("response.jsp");
    }
    
    /**
     * jugarMastermind recoge los números escogidos por los jugadores al darle al botón
     * "tirar", comprueba los números y devuelve strings con los aciertos y errores
     * @author Pablo Rodriguez
     * @param request
     * @param response
     * @throws IOException 
     */
    private void jugarMastermind(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        //iniciamos sesión
        HttpSession session = request.getSession();
        
        //recogemos el número de jugadas
        int num_jugadas= (Integer)session.getAttribute("num_jugadas");
        
        //guardamos los valores introducidos por los dos jugadores
        int num1 = Integer.valueOf(request.getParameter("eleccion1"));
        int num2 = Integer.valueOf(request.getParameter("eleccion2"));
        
        //guardamos el número aleatorio 
        int num_secreto = (Integer)session.getAttribute("numero_aleatori");
        
        //comprobamos las tiradas
        String comprobar1 = comprobar_tirada(num1, num_secreto);
        String comprobar2 = comprobar_tirada(num2, num_secreto);
        
        //modificamos las variables de sesión con las tiradas de los jugadores
        session.setAttribute("comprobar1", comprobar1);
        session.setAttribute("comprobar2", comprobar2);
        
        //aumentamos el número de jugadas
        session.setAttribute("num_jugadas", num_jugadas+1);  
        
        response.sendRedirect("response.jsp");
        
    }
    
    /**
     * primer_torn, número random entre 1 y 2
     * @author Pablo Rodriguez
     * @return 1 o 2
     */
    private int primer_torn() {

        int jugador = (int) (Math.random() * 2 + 1);
        return jugador;
    }

    /**
     * potencia10, función recursiva de potencia 10
     * @author Pablo Rodriguez
     * @param exponente al que se eleva 10
     * @return resultado
     */
    private int potencia10(int exponente) {

        if (exponente == 0) {
            return 1;
        } else {
            return 10 * potencia10(exponente - 1);
        }

    }

    /**
     * numero_aleatori, número de 4 dígitos entre 0 y 9999
     * @author Pablo Rodriguez
     * @param number_digits
     * @return número aleatorio
     */
    private int numero_aleatori(int number_digits) {

        int resultado = 0;
        int unidad_aleatoria;

        for (int i = 0; i < number_digits; i++) {
            unidad_aleatoria = (int) (Math.random() * 10);
            resultado += unidad_aleatoria * potencia10(i);
        }

        return resultado;
    }

    /**
     * xifra, se le pasa un número, una posición y devuelve el dígito en esa posición
     * @author Pablo Rodriguez
     * @param numero
     * @param posicion
     * @return el dígito en esa posición
     */
    private int xifra(int numero, int posicion) {
        int unidad = 0;

        unidad = (int) (numero % potencia10(posicion)) / potencia10(posicion - 1);
        return unidad;
    }

    /**
     * comprobar_tirada, se le pasa número de usuario y el número secreto
     * Por cada dígito del número introducido se comprueba con el dígito del
     * número a adivinar
     * @param numero_usuario
     * @param secreto
     * @return un string con ">" si se ha quedado corto, '<' si es más grande y "*" si es correcto
     */
    private String comprobar_tirada(int numero_usuario, int secreto) {
        String resultado = "";

        for (int i = 4; i > 0; i--) {
            if (xifra(numero_usuario, i) == xifra(secreto, i)) {
                resultado += "*";
            }
            if (xifra(numero_usuario, i) < xifra(secreto, i)) {
                resultado += ">";
            }
            if (xifra(numero_usuario, i) > xifra(secreto, i)) {
                resultado += "<";
            }
        }

        return resultado;
    }

    

}
