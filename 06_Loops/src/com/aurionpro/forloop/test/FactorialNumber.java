package com.aurionpro.forloop.test;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int number = sc.nextInt();
		int factorial = 1;
		
		for(int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}

		System.out.println("Factorial is "+factorial);
	}
}
