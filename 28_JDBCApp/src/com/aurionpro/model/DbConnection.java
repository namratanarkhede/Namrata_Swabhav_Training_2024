package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {

	private Connection connection = null;
	private Statement statement = null; 
	private PreparedStatement preparedStatements = null;
	
	public void connectToDb() {
		try {
			//1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Create Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scm", "root","root");
			System.out.println("Connection Succesfull");
		
			
						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getSupplierDetails() {
		
		//3. Create Statement
		
		try {
			statement = connection.createStatement();
			//4. Exexute query and store it in a ResultSet
			ResultSet dbSupplierData = statement.executeQuery("select * from suppliers");
			
			while(dbSupplierData.next()) {
				System.out.println(dbSupplierData.getInt("SupplierID") + "\t" 
									+ dbSupplierData.getString("Name") + "\t"
									+ dbSupplierData.getString("ContactInfo") + "\t"
									+ dbSupplierData.getString("Address"));
			}
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void addSupplierDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Supplier id:");
		int SupplierID = sc.nextInt();
		
		System.out.println("Enter the Name:");
		String name = sc.next();
		sc.next();
		
	
		System.out.println("Enter the ContactInfo:");
		String contact = sc.next();
	
		
		System.out.println("Enter the Address:");
		String address = sc.next();
		sc.next();
	
		
		
		
		try {
			//statement = connection.createStatement();
			//4. Exexute query and store it in a ResultSet
		    //statement.executeUpdate("insert into suppliers values("+SupplierID+",'" +name+",'" + contact+ "', '"+address+ "')");
			
			preparedStatements = connection.prepareStatement("insert into suppliers values(?,?,?,?)");
			preparedStatements.setInt(1, SupplierID);
			preparedStatements.setString(2, name);
			preparedStatements.setString(3, contact);
			preparedStatements.setString(4, address);
			preparedStatements.executeUpdate();
			System.out.println("Record inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
