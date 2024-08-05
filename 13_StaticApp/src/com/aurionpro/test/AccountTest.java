package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Account;

public class AccountTest {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
		Account account2= new Account();
		
		account2.createAccount();
		Account account3 = new Account();
		
		account3.createAccount();
		
		
		Account.display();
	}


}
