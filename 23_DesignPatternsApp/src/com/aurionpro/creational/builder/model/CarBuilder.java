package com.aurionpro.creational.builder.model;

public class CarBuilder {
	private String carName;
    private String carModel;
    private int registerNo;
    private double price;
	public CarBuilder setCarName(String carName) {
		this.carName = carName;
		return this;
	}
	public CarBuilder setCarModel(String carModel) {
		this.carModel = carModel;
		return this;
	}
	public CarBuilder setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
		return this;
	}
	public CarBuilder setPrice(double price) {
		this.price = price;
		return this;
	}
	public Car getCar() {
		return new Car(carName, carModel, registerNo, price);
	}
	
    
  
}
