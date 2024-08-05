package com.aurionpro.forloop.test;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines : ");
		int number = sc.nextInt();
		int k= 1;
		for(int i = 1; i <=number ; i++) {
			for(int j =1; j <= i ; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}


}
