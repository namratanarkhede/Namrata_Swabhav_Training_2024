package com.aurionpro.operator.types;

import java.util.Scanner;

// Ternary operator provides a concise way to implement conditional statement
// condition ? if true : if false

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the number2: ");
        int number2 = scanner.nextInt();
        
        
        int result = (number1 > number2) ? number1 : number2;
        System.out.println("Result: " + result);
    }

}
