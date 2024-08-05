package com.aurionpro.test;

import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Entert he number : ");
		int number =  sc.nextInt();
		
		if(number % 2 ==0) {
			System.out.println("The number is even");
			return;
		}
		System.out.println("Number is odd.");
		
		
	}
}
