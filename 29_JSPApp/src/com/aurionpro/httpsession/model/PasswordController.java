package com.aurionpro.httpsession.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "PasswordController1", urlPatterns = { "/PasswordController1" })
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PasswordController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

        // Retrieve the session
        HttpSession session = request.getSession(false);
        String username = (session != null) ? (String) session.getAttribute("username") : null;
        
        String password = request.getParameter("password");

        response.getWriter().print("<html><body>");
        if (username != null) {
            response.getWriter().print("Username: " + username + "<br>");
            response.getWriter().print("Password: " + password);
        } else {
            response.getWriter().print("No username found in session.");
        }
        response.getWriter().print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
