package com.aurionpro.batchprocessing.test;

import com.aurionpro.batchprocessing.model.DBConnection;

public class DBTest {

	public static void main(String[] args) {
		DBConnection connection = new DBConnection();
		connection.connectToDb();	
		connection.printmenu();
		
		
	}
}
