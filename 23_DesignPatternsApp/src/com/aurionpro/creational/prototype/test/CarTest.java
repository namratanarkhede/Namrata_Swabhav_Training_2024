package com.aurionpro.creational.prototype.test;

import com.aurionpro.creational.prototype.model.Car;
import com.aurionpro.creational.prototype.model.ICar;

public class CarTest {
	 public static void main(String[] args) {
	        try {
	            ICar originalCar = new Car("Toyota");

	            ICar clonedCar = originalCar.clone();

	            System.out.println("Original Car Name: " + originalCar.getName());
	            originalCar.start();
	            originalCar.stop();

	            System.out.println("\nCloned Car Name: " + clonedCar.getName());
	            clonedCar.start();
	            clonedCar.stop();

	            
	            ((Car) clonedCar).setName("Honda");
	            System.out.println("After renaming, Cloned Car Name: " + clonedCar.getName());

	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }

}
