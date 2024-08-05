package com.aurionpro.iterative.test;

public class AdditionCalculator {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum += i ;
			i++;
		
		}
		
		System.out.println("The addition of 1 to 100 is : "+sum);
	}

}
