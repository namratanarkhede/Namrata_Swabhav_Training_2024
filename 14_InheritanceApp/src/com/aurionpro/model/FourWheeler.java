package com.aurionpro.model;

public class FourWheeler extends Vechicle{
	private double mileage;
	
	public FourWheeler(String companyName, double mileage) {
		super(companyName);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	

}
