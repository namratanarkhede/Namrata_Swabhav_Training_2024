package com.aurionpro.iterative.test;

import java.util.Scanner;

public class DigitsSumCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int sum = 0;
		int digit = 0;
		while(number> 0) {
			digit = number % 10;  
			sum = sum + digit;  
			number = number / 10;  
		}
		System.out.println("Sum of Digit : " + sum );
	}
}
