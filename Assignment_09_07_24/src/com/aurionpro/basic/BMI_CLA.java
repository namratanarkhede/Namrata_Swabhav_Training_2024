package com.aurionpro.basic;


public class BMI_CLA {
	public static void main(String[] args) {
		
		double weight = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		
		double bmi = weight/(height*height);
		
		System.out.println("Your BMI is : " +bmi);
	}

}
