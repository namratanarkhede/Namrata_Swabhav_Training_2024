package com.aurionpro.basic;

public class AreaOfTrapezoid_CLA {
	public static void main(String[] args) {
		
		double base1 = Double.parseDouble(args[0]);
		
		double base2 = Double.parseDouble(args[1]);
		
		double height = Double.parseDouble(args[2]);
		
		double areaOfTrapezoid= ((base1+base2)/2)*height;
		
		System.out.println("The Area Of Traprzoid is : " + areaOfTrapezoid);
		
		
	}
}
