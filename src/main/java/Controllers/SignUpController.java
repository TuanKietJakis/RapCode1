/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAOs.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kiet
 */
public class SignUpController extends HttpServlet {

    private AccountDAO acc;

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
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUpController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUpController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String path = request.getRequestURI();
        if (path.endsWith("/SignUp")) {
            request.getRequestDispatcher("/Signup.jsp").forward(request, response);
        }
    }

    @Override
    public void init() throws jakarta.servlet.ServletException {
        super.init();
        try {
            // Khởi tạo AccountDAO trong phương thức init()
            acc = new AccountDAO(); // Đảm bảo đã khởi tạo đối tượng AccountDAO trước khi sử dụng
        } catch (Exception ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            String Account_ID = acc.GetMaxAccountID();
            String username = request.getParameter("txtUsername");
            String fullname = request.getParameter("txtFullName");
            String password = request.getParameter("txtPassword");
            String mobileNumber = request.getParameter("txtMobileNumber");
            String email = request.getParameter("txtEmail");
            String address = request.getParameter("txtAddress");
            String gender = request.getParameter("selectGender");
            String dob = request.getParameter("dob");
            AccountDAO dao = new AccountDAO();

            if (dao.checkUserNameIsExist(username)) {
                request.setAttribute("Wrong", "Error! Username Already Exists!");
                request.getRequestDispatcher("/Signup.jsp").forward(request, response);

            }

            else if (dao.checkEmailIsExist(email)) {
                request.setAttribute("Wrong", "Error! Email Already Exists!");
                request.getRequestDispatcher("/Signup.jsp").forward(request, response);
            }
            else{
            //"16","Kiet2","user6","123","0797119869","onie.mann@hotmail.com ","abc","0","Female","1992-07-06"
            acc.signup(String.valueOf(Integer.parseInt(Account_ID) + 1), "non", username, password, "non", email, "non", "0", "non", "1111-11-11");
            response.sendRedirect("/Login");
            }
        } catch (Exception ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
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

}
