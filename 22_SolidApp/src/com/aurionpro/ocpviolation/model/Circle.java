package com.aurionpro.ocpviolation.model;

public class Circle implements Shape {
	
	private int radius;

	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}


	@Override
	public void area() {
		System.out.println("The area of radius is : " +(3.14*this.radius*this.radius));	
		
	}

}
