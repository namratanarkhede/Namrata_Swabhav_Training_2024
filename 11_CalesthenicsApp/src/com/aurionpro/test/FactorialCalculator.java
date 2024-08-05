package com.aurionpro.test;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Entert he number : ");
		int number =  sc.nextInt();
		
		int factorial = calculateFactorial(number);
		
		if(factorial == -1) {
			System.out.println("Can not calculate the factorial of negative number");
			return;
			
		}
		
		System.out.println(factorial);

	}

	private static int calculateFactorial(int number) {
		if(number == 0)
			return -1;
		if(number < 0)
			return -1;
		int fact = 1;
		for(int i = 0; i < number ; i++) {
			fact = fact*i;
		}
		return fact;
	}

}
