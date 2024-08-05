package com.aurionpro.selection.test;

import java.util.Scanner;

public class MaximumOfThreeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = scanner.nextInt();
		System.out.println("Enter the third number : ");
		int number3 = scanner.nextInt();
		
		if((number1 > number2) && (number1 > number2)) {
			System.out.println("The maximum number is number1 = " +number1);
		}
		if((number2 > number1) && (number2 > number3)) {
			System.out.println("The maximum number is number2 = " +number2);
		}
		else {
			System.out.println("The maximum number is number3 = " +number3);
		}
		
		scanner.close();
	}

}
