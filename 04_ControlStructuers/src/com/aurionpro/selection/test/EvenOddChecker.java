package com.aurionpro.selection.test;

import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number= scanner.nextInt();
		if (number%2 == 0) {
			System.out.println("The given number is even.");
		}else {
			System.out.println("The given number is odd");
		}
	}

}
