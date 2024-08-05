package com.aurionpro.selection.test;

import java.util.Scanner;

public class MaximumOfTwoNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = scanner.nextInt();
		
		if(number1 > number2) {
			System.out.println("The Maximum Number is " +number1 );
		}
		else {
			System.out.println("The Maximum Number is " +number2 );
		}
	}

}
