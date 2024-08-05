package com.aurionpro.basic;

import java.util.Scanner;

public class DistanceCalculator_Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the x1 point : ");
		double x1 = scanner.nextDouble();
		
		System.out.print("Enter the y1 point : ");
		double y1 = scanner.nextDouble();
		
		System.out.print("Enter the x2 point : ");
		double x2 =	scanner.nextDouble();
		
		System.out.print("Enter the y2 point : ");
		double y2 = scanner.nextDouble();
		
		double distance= Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		
		System.out.println("The distance between the two point (x1 , y1) : (" + x1 + " ," + y1 + ") and (x2 , y2) : (" + x2 + " , " + y2 + ") is = " + distance );
	
		scanner.close();
	}
	

}
