package com.aurionpro.model;

import java.util.Scanner;

public class CalculatorUserInput {
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		if (b==0) {
			throw new ArithmeticException("Division by zero not allowed" );
		}
		return a/b;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CalculatorUserInput calculatorUserInput = new CalculatorUserInput();
		
		System.out.print("Enter the First Number: ");
		int a= scanner.nextInt();
		System.out.print("Enter the Second Number: ");
		int b= scanner.nextInt();
		
		System.out.println("Addition of " + a + " and " + b + " is : "+calculatorUserInput.add(a,b));
		System.out.println("Subtraction of " + a + " and " + b + " is : "+calculatorUserInput.subtract(a,b));
		System.out.println("Multiplication of " + a + " and " + b + " is : "+calculatorUserInput.multiply(a,b));
		System.out.println("Division of " + a + " and " + b + " is : "+calculatorUserInput.divide(a,b));
	}


}
