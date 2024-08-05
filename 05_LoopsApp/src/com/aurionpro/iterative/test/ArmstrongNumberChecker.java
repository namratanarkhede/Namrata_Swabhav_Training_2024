package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ArmstrongNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int sum = 0; 
		int digit, power = 0;
		int temp = number;
		while(number > 0) {
			power++;
			number = number/10;
		}
		number = temp;
		while(number != 0) {
			digit = number % 10; 
			sum += (int) Math.pow(digit, power);
			number = number/10;
		}
		System.out.println(sum);
		if(sum == temp) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}

	}

}
