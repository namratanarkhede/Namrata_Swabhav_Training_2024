package com.aurionpro.operator.types;

class Vehicle {
	
}

class Car extends Vehicle {
	
}
// Used to test if an object is an instance of a specific class.
public class InstanceOfOperator {
	public static void main(String[] args) {
		Vehicle vehicle = new Car();
	    
	    System.out.println("vehicle instanceof Vehicle: " + (vehicle instanceof Vehicle));
	    System.out.println("vehicle instanceof Car: " + (vehicle instanceof Car));
	}
	
}
