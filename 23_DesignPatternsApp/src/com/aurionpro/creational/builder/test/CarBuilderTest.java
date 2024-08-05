package com.aurionpro.creational.builder.test;

import com.aurionpro.creational.builder.model.Car;
import com.aurionpro.creational.builder.model.CarBuilder;

public class CarBuilderTest {
	public static void main(String[] args) {
        Car car = new CarBuilder().setCarName("Tata").setPrice(100000).getCar();

	
        System.out.println(car);
	}

}
