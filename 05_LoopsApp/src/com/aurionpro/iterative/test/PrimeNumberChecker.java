package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		int i = 2;
		boolean isPrime = true;
		
		while(i < number) {
			if(number%i == 0) {
				isPrime = false;
			}
			i++;
		}
		if(isPrime) {
			System.out.println("The number is prime.");
		}
		else {
			System.out.println("The number is Not Prime");
		}
		
	}

}
