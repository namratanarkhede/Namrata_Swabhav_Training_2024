package com.aurionpro.test;

import com.aurionpro.model.DbConnection;

public class DbTest {

	public static void main(String[] args) {
		DbConnection connection = new DbConnection();
		connection.connectToDb();
		connection.getSupplierDetails();
		connection.addSupplierDetails();
		connection.getSupplierDetails();
	}
}
