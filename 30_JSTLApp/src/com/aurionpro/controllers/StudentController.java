package com.aurionpro.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.db.DbConnection;
import com.aurionpro.entity.Student;

@WebServlet("/student")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DbConnection dbConnection = null;
	private RequestDispatcher dispatcher = null;
	
    public StudentController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dbConnection = new DbConnection();
		dbConnection.connectToDb();
		
		List<Student> students = dbConnection.getAllStudent();
		
		// Set students as a request attribute
		request.setAttribute("students", students);
		
		// Forward to JSP
		dispatcher = request.getRequestDispatcher("StudentView.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
