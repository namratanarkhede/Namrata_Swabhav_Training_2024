package com.aurionpro.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController1")
public class LoginController1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginController1() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html"); // Fix the content type
        String username = request.getParameter("username");

        Cookie cookie1 = new Cookie("username", username);
        cookie1.setMaxAge(10000);
        response.addCookie(cookie1); // Add the cookie to the response

        response.getWriter().print("Welcome : " + username);
        response.getWriter().print("<form action='PasswordController' method='post'>"); // Use POST method to handle password
        response.getWriter().print("Password : <input type='password' name='password'><br><input type='submit' value='go'>");
        response.getWriter().print("</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Using doPost to delegate to doGet
        doGet(request, response);
    }
}
