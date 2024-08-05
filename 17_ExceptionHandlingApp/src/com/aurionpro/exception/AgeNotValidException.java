package com.aurionpro.exception;

//custom exception : create the class as the subclass of Exception.

public class AgeNotValidException extends RuntimeException{

	private int age;
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}
	public String getMessage() {
		
		return "Age can not be less than 18. You entered " +age+ "which is not valid for voting.";
		
	}
}
