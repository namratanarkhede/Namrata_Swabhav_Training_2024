package com.aurionpro.test;

import java.util.Scanner;

public class CommandLineArgumentExample {
	public static void main(String[] args) {
		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);

		System.out.println("Before Swaping: number1 ="+ number1 + " number2= " + number2);
		
		number1= number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		
		System.out.println("After Swaping: number1 ="+ number1 + " number2= " + number2);

	}
	
}
