package com.aurionpro.creational.singleton.model;

public class DatabaseConnection {
	private static DatabaseConnection access;
	
	private DatabaseConnection() {
		System.out.println("Database Connection");
	}
	
	public static DatabaseConnection getAccess() {
		if(access == null)
			access = new DatabaseConnection();
		if(access.equals("Admin")) {
			access.Access();
		}
		return access;
	}
	
	
	private void Access() {
		System.out.println("Access the database");
	}

	
}
