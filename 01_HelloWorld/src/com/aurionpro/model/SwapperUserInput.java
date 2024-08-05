package com.aurionpro.model;

import java.util.Scanner;

public class SwapperUserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number1 : ");
		int number1 = scanner.nextInt();
		System.out.print("Enter the number2 : ");
		int number2 = scanner.nextInt();
		
		System.out.println("Before Swaping: number1 ="+ number1 + " number2= " + number2);
		
		int temp = number1;
		number1=number2;
		number2=temp;
		
		System.out.println("After Swaping: number1 ="+ number1 + " number2= " + number2);
		

	}

}
