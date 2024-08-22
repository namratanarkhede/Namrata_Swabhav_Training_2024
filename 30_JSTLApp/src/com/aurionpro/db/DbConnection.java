package com.aurionpro.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Student;

public class DbConnection {

	private Connection connection = null;
	private Statement statement = null; 
	private PreparedStatement preparedStatements = null;
	
	public void connectToDb() {
		try {
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Create Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
			System.out.println("Connection Successful");
			
			// Create Statement
			statement = connection.createStatement();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<Student>();
		ResultSet dbStudents = null;
		
		try {
			// Execute Query
			dbStudents = statement.executeQuery("SELECT * FROM students");
			
			// Process Result Set
			while (dbStudents.next()) {
				int rollNumber = dbStudents.getInt("roll_number"); 
				String name = dbStudents.getString("name");
				double percentage = dbStudents.getDouble("percentage"); 
				
				Student student = new Student(rollNumber, name, percentage);
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Close resources
			try {
				if (dbStudents != null) dbStudents.close();
				if (statement != null) statement.close();
				if (connection != null) connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return students;
	}
}
