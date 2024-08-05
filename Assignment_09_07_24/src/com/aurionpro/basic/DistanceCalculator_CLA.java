package com.aurionpro.basic;


public class DistanceCalculator_CLA {
	public static void main(String[] args) {
		double x1 = Double.parseDouble(args[0]);
		
		double y1 = Double.parseDouble(args[1]);
		
		double x2 =	Double.parseDouble(args[2]);
		
		double y2 = Double.parseDouble(args[3]);
		
		double distance= Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		
		System.out.println("The distance between the two point (x1 , y1) : (" + x1 + " ," + y1 + ") and (x2 , y2) : (" + x2 + " , " + y2 + ") is = " + distance );
	}

}
