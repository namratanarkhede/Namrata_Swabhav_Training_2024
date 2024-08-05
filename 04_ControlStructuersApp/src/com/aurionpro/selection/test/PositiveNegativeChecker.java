package com.aurionpro.selection.test;

import java.util.Scanner;

public class PositiveNegativeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = scanner.nextInt();
		
		if(number >= 0 ) {
			System.out.println("The given number is positive");
		}
		else {
			System.out.println("The given number is negative");
		}
	}
}
