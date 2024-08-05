package com.aurionpro.model;

public class Car extends FourWheeler{
	public Car(String companyName, double mileage , double price) {
		super(companyName, mileage);
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Car [price=" + price + ", Mileage=" + getMileage() + ", CompanyName=" + getCompanyName()
				+"]";
	}


	private double price;
	

}
