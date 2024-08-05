package com.aurionpro.test;

import com.aurionpro.model.ISayable;

//Functional Interface => 
//Interface having only one abstract method. can have many default, static method.
//Plays crusial role while we create the lambda expression.
// example, Runnable, Callable, Comprator etc.
// to make the interface functional we use annotation @FunctionalInterface

// Marker Interface =>
// Has zero abstract methods
// example : Serializable 
// Used for Tagging the classes.


public class SayableTest {

	public static void main(String[] args) {

//		ISayable sayable = new ISayable() {
//
//			@Override
//			public void say() {
//				System.out.println("I am inside sayable");
//				
//			}
//			
//		};
		
		ISayable sayable = () -> System.out.println("I am inside sayable");
		
		sayHello(sayable); 
		
		
		
	}
	
	private static void sayHello(ISayable sayable) {
		sayable.say();
	}

}
