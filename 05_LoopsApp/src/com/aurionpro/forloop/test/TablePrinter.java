package com.aurionpro.forloop.test;

import java.util.Scanner;

public class TablePrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int number= sc.nextInt();
		int table = 0;
		
		for(int i= 1; i <= 10 ; i++) {
			table = number*i;
			System.out.println(table);
		}
	}

}
