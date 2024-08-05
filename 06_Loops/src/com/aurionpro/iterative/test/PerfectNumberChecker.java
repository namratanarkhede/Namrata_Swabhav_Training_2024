package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PerfectNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number : ");
		int number = sc.nextInt();
		int sum = 0;
		int i = 0 ;
		while(i  <= (number/2)) {
			if(number % i == 0 ) {
				sum += i;
			}
			i++;
		}
		if(sum == number) {
			System.out.println("The number is perfect.");
			
		}
		else {
			System.out.println("The number is perfect.");
			
		}
	}
}
