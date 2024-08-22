package com.aurionpro.httpsession.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//HttpSession provides a way to store and retrieve session attributes on the server side, 
//making it more secure and flexible than using cookies, 
//especially for storing sensitive information like passwords or user details.






@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
	      String username = request.getParameter("username");

	      // Create a new session or retrieve the existing session
	      HttpSession session = request.getSession();
	      session.setAttribute("username", username); // Store username in session

	      response.getWriter().print("Welcome : " + username);
	      response.getWriter().print("<form action='PasswordController' method='post'>");
	      response.getWriter().print("Password : <input type='password' name='password'><br><input type='submit' value='go'>");
	      response.getWriter().print("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
