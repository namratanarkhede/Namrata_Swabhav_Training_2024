package com.aurionpro.basic;

import java.util.Scanner;

public class AreaOfTrapezoid_Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the length of base1 : ");
		double base1 = scanner.nextDouble();
		
		System.out.print("Enter the length of base2 : ");
		double base2 = scanner.nextDouble();
		
		System.out.print("Enter the height of Trapezoid : ");
		double height = scanner.nextDouble();
		
		double areaOfTrapezoid= ((base1+base2)/2)*height;
		
		System.out.println("The Area Of Traprzoid is : " + areaOfTrapezoid);
		
		scanner.close();
		
	}

}
