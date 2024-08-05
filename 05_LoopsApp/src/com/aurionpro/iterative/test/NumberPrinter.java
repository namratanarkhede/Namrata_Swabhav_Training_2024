package com.aurionpro.iterative.test;

import java.util.Scanner;

public class NumberPrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		while(number>=1) {
			System.out.println(number);
			number--;
		}
	}

}
