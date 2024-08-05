package com.aurionpro.basic;

import java.util.Scanner;

public class MinToHrMin_Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the minutes: ");
		int minutes = scanner.nextInt();
		
		
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		
		System.out.println("The conversion of Minute to hours and minutes is : " + hours +" hours and "+remainingMinutes+ " minutes");
	
		scanner.close();
	}

}
