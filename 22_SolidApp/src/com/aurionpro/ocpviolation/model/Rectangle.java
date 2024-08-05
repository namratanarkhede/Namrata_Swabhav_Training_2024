package com.aurionpro.ocpviolation.model;

public class Rectangle implements Shape {
	private int width;
	private int height;
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public void area() {
		System.out.println("Area of rectangle is : " + this.width*this.height);
		
	}
	
	

}
