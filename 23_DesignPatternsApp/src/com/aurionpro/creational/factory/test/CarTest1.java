package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.CarName;
import com.aurionpro.creational.factory.model.ICar;
import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Maruti;
import com.aurionpro.creational.factory.model.Tata;

public class CarTest1 {
	public static void main(String[] args) {
		ICar car;
		
		System.out.println("Mahindra Car");
		car= CarFactory.makeCar(CarName.MAHINDRA);
		car.start();
		car.stop();
		
		System.out.println("\nTata Car");
		car= CarFactory.makeCar(CarName.TATA);
		car.start();
		car.stop();
		
		System.out.println("\nMaruti Car");
		car =CarFactory.makeCar(CarName.MARUTI);
		car.start();
		car.stop();
		
	}

}
