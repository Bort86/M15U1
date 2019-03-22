package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Patient;
import model.PatientDAO;
import model.User;
import model.UserDAO;

/**
 *
 * @author Pablo Rodriguez
 */
@WebServlet(name = "controller", urlPatterns = {"/controller"})
public class controller extends HttpServlet {

    private String ruta;
    private PatientDAO pdao;
    private UserDAO udao;

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
                case "indexar":
                    indexar(response, request);
                    break;
                case "login":
                    login(response, request);
                    break;
                case "Filtrar":
                    filtrar(response, request);
                    break;
                case "Añadir Paciente":
                    addPat(response, request);
                    break;
            }
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

    private void indexar(HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
        List<Patient> result = new ArrayList();

        ruta = getServletContext().getRealPath("/WEB-INF");
        pdao = new PatientDAO(ruta);

        result = pdao.listAll();

        request.setAttribute("result", result);
        RequestDispatcher rd = request.getRequestDispatcher("index2.jsp");
        rd.forward(request, response);
    }

    private void login(HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ruta = getServletContext().getRealPath("/WEB-INF");
        udao = new UserDAO(ruta);

        User u = new User(username, password);

        if (udao.findOne(u)) {
            List<Patient> result = new ArrayList();
            pdao = new PatientDAO(ruta);
            result = pdao.listAll();

            HttpSession session = request.getSession();
            session.setAttribute("rol", u.getRol());

            request.setAttribute("result", result);
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request, response);

        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }

    private void filtrar(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        ruta = getServletContext().getRealPath("/WEB-INF");
        pdao = new PatientDAO(ruta);
        
        List<Patient> result = new ArrayList();
        String classificacio = request.getParameter("classificacio");  
        String menopausia = request.getParameter("Menopausia");
        String tipusMenopausia = request.getParameter("tipusMenopausia");
        
        List<Patient> all_pat = new ArrayList();
        all_pat = pdao.listAll();
        
        for (Patient patient : all_pat) {
            if (patient.getClassificacio().equals(classificacio) &&
                    patient.getMenopausia().equals(menopausia) &&
                    patient.getTipusMenopausia().equals(tipusMenopausia)){
                result.add(patient);
            }
        }
        
        request.setAttribute("result_filt", result);
            RequestDispatcher rd = request.getRequestDispatcher("filter_pac.jsp");
            rd.forward(request, response);
    }

    private void addPat(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        ruta = getServletContext().getRealPath("/WEB-INF");
        pdao = new PatientDAO(ruta);
        String result="";
        
        int edad = Integer.parseInt(request.getParameter("edad"));
        int peso = Integer.parseInt(request.getParameter("peso"));
        int talla = Integer.parseInt(request.getParameter("talla"));
        int menarquia = Integer.parseInt(request.getParameter("menarquia")); ;
        String grupoEdad = request.getParameter("grupoEdad");
        String classificacio = request.getParameter("classificacio");  
        String menopausia = request.getParameter("Menopausia");
        String tipusMenopausia = request.getParameter("tipusMenopausia");
        double imc = peso / (talla/100);
        int registre;
        
        List<Patient> all_pat = new ArrayList();
        all_pat = pdao.listAll();
        registre = all_pat.size() + 1;
        
        Patient new_patient = new Patient(registre, edad, grupoEdad, peso, talla, imc, classificacio, menarquia, menopausia, tipusMenopausia);
        if (pdao.addOne(new_patient)==1){
            result = "Paciente añadido correctamente";
        } else {
            result = "Ha habido un error con la base de datos, vuelva a intentarlo más tarde.";
        }
        request.setAttribute("result_addPat", result);
        RequestDispatcher rd = request.getRequestDispatcher("add_pac.jsp");
        rd.forward(request, response);
    
    }

}
