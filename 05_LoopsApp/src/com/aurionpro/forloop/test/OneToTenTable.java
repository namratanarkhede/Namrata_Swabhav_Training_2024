package com.aurionpro.forloop.test;

import java.util.Scanner;

public class OneToTenTable {

	public static void main(String[] args) {
		int table = 0;
		for (int number= 1; number <=10; number++) {
			for(int i= 1; i <= 10 ; i++) {
				table = number*i;
				System.out.print(table +"\t" );
			}
			System.out.println("");
		}
	}

}
