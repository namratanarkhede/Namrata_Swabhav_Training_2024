package com.aurionpro.test;

import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1 : ");
		int number1 = sc.nextInt();
		System.out.println("Enter the number 2: ");
		int number2 = sc.nextInt();
	
		int result = addition(number1, number2);
		System.out.println("The addition of two number is : " + result);
		result = subtraction(number1, number2);
		System.out.println("The Subtraction of two number is : " + result);
		result = multiply(number1, number2);
		System.out.println("The multiplication of two number is : " + result);
		result = divide(number1, number2);
		System.out.println("The division of two number is : " + result);
		
		
	}
	
	private static int addition(int number1, int number2) {
		return number1+number2;
	}
	private static int subtraction(int number1, int number2) {
		return number1-number2;
	}
	private static int multiply(int number1, int number2) {
		return number1*number2;
	}
	private static int divide(int number1, int number2) {
		return number1/number2;
	}
	

}
