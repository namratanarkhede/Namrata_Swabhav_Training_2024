package com.aurionpro.creational.builder.model;

public class Car {
    private String carName;
    private String carModel;
    private int registerNo;
    private double price;
	public Car(String carName, String carModel, int registerNo, double price) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.registerNo = registerNo;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + ", registerNo=" + registerNo + ", price=" + price
				+ "]";
	}
	
    
 
}
