package com.aurionpro.basic;


public class MinToHrMin_CLA {
	public static void main(String[] args) {
		 
		int minutes = Integer.parseInt(args[0]);
		
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		
		System.out.println("The conversion of Minute to hours and minutes is : " + hours +" hours and "+remainingMinutes+ " minutes");
	}
}
