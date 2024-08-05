package com.aurionpro.creational.adstractfactory.test;

import com.aurionpro.creational.adstractfactory.model.ICarFactory;
import com.aurionpro.creational.adstractfactory.model.ICars;
import com.aurionpro.creational.adstractfactory.model.MahindraFactory;
import com.aurionpro.creational.adstractfactory.model.MarutiFactory;


public class CarTest {
	public static void main(String[] args) {
		
		ICarFactory marutiFactory = new MarutiFactory();
		ICars maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
		
	}

}
