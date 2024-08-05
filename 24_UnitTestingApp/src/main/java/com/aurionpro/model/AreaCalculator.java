package com.aurionpro.model;

public class AreaCalculator {
	
	double calculateCircleArea(int radius) {
		return 3.14*radius*radius;
		
	}

	double calculateRactangleArea(int length, int breadth) {
		return length*breadth;
		
	}
	
	double calculateTraingleArea(int base, int height) {
		return 0.5*base*height;
		
		
	}
}
