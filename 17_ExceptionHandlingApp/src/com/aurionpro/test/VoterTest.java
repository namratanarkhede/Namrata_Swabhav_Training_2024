package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exception.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {
	public static void main(String[] args) {
		Voter voter = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Voter Id");
			int voterId = sc.nextInt();
			
			System.out.println("Enter the first name: ");
			String firstName = sc.next();
			
			System.out.println("Enter the last name :");
			String lastName = sc.next();
			
			System.out.println("Enter the voters age : ");
			int age = sc.nextInt();
			
			voter = new Voter(voterId, firstName, lastName, age);
		
		}
		catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(voter);
	}

}
