package com.aurionpro.forloop.test;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines : ");
		int number = sc.nextInt();
		for(int i = 0; i <=number ; i++) {
			for(int j =1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
