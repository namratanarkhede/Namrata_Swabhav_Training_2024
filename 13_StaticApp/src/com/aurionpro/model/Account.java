package com.aurionpro.model;

public class Account {
	static private int accountNo;
	public String name;
	
	public void createAccount() {
		System.out.println("Create account");
		
		accountNo += 1;
	}
	public static void display() {
		System.out.println(accountNo);
	}

}
