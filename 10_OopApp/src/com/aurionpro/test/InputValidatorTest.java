package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.InputValidator;

public class InputValidatorTest {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		InputValidator inputValidator = new InputValidator(); 
		
		System.out.println("Enter the username : ");
		String username = scanner.next();
		
		checkUserName(username, inputValidator);
		
		System.out.println("Enter the password : ");
		String password = scanner.next();
		checkPassword(password, inputValidator);
		
		System.out.println("Enter the email : ");
		String email = scanner.next();
		checkEmail(email, inputValidator);
		
		
		
	}

	private static void checkEmail(String email, InputValidator inputValidator) {
		if(!inputValidator.validateEmail(email)) {
			System.out.println("email is invalid");
			return;
		}
		System.out.println("email is valid");
		
	}

	private static void checkPassword(String password, InputValidator inputValidator) {
		if(!inputValidator.validatePassword(password)) {
			System.out.println("Password is invalid");
			return;
		}
		System.out.println("Password is valid");
		
	}

	private static void checkUserName(String username, InputValidator inputValidator) {
		if(!inputValidator.validateUsername(username)) {
			System.out.println("Username is invalid");
			return;
		}
		System.out.println("Username is valid");
	}

}
