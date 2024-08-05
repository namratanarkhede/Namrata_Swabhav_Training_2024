package com.aurionpro.operator.types;

import java.util.Scanner;

//used for simple arithmetic Operations => { * , / , % , + , - }
public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number 1 :");
		int number1 = scanner.nextInt();
		
		System.out.print("Enter the number 2 :");
		int number2 = scanner.nextInt();
		
		System.out.println("Addition of " + number1 +" and " + number2 + " is: " +(number1+number2));
		System.out.println("Subtraction of " + number1 +" and " + number2 + " is: " +(number1-number2));
		System.out.println("Multiplication of " + number1 +" and " + number2 + " is: " +(number1*number2));
		System.out.println("Division of " + number1 +" and " + number2 + " is: " +(number1/number2));
		System.out.println("Modulo of " + number1 +" and " + number2 + " is: " +(number1%number2));

	
	
	}
	

}
