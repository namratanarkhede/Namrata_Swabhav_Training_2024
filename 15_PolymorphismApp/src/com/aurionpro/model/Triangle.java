package com.aurionpro.model;

public class Triangle extends Shape{

	private int base;
	private int heigth;
	
	

	public Triangle(int base, int heigth) {
		super();
		this.base = base;
		this.heigth = heigth;
	}

	@Override
	public void area() {
		System.out.println("The area of Triangle is : " + 0.5*base*heigth);
		
	}
}
