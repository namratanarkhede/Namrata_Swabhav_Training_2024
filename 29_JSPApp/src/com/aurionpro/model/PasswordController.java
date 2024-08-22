package com.aurionpro.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public PasswordController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String username = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    username = cookie.getValue();
                    break;
                }
            }
        }

        String password = request.getParameter("password");

        response.getWriter().print("<html><body>");
        if (username != null) {
            response.getWriter().print("Username: " + username + "<br>");
            response.getWriter().print("Password: " + password);
        } else {
            response.getWriter().print("No username found in cookies.");
        }
        response.getWriter().print("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle POST requests as well
        doGet(request, response);
    }
}
