package com.aurionpro.basic;

import java.util.Scanner;

public class CompoundInterest_Scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the principal amount : ");
		double principal = scanner.nextDouble();
		
		System.out.println("Enter the annual rate of interest in percentage : ");
		double rateOfIntrest = scanner.nextDouble();
		
		System.out.println("Enter the time in years : ");
		double time = scanner.nextDouble();
	
		double amount = principal * Math.pow((1+rateOfIntrest/100),time ) ;
		double compoundIntrest = amount - principal;
		
		System.out.println("The Compound Interest : " +compoundIntrest);
		
		scanner.close();
	
	}

}
