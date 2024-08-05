package com.aurionpro.model;

//in Java 8 we can add defination for method in interface. 
// also we have to declare that method as default or static.

//if method is static then the method is called using the Name of the interface.
//if the method is default then the method is called if the method is not overriden in implemented class.
//if the method is called in implements class then the overriden defination is executed


public interface Shape {
	void area();
	
	default void volume() {
		System.out.println("Inside the Shape");
		
	}
	static void perimeter() {
		System.out.println("Inside the static method");
	}

}
