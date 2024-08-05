package com.aurionpro.basic;

import java.util.Scanner;

public class BMI_Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the your weight in kilograms : ");
		double weight = scanner.nextDouble();
		System.out.print("Enter the your height in meters : ");
		double height = scanner.nextDouble();
		
		double bmi = weight/(height*height);
		
		System.out.println("Your BMI : " +bmi);
		scanner.close();
		
	}

}
