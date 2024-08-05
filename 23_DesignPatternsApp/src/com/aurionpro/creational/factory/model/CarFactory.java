package com.aurionpro.creational.factory.model;

public class CarFactory {
	public static ICar makeCar(CarName carName) {
		
		ICar car = null;
		if(carName == CarName.MARUTI)
			car = new Maruti();
		if(carName == CarName.TATA)
			car = new Tata();
		if(carName  == CarName.MAHINDRA)
			car = new Mahindra();
		return car;
	}

}
