package com.aurionpro.model;

public class Operations {
	int addition(int number1, int number2) {
		return number1+number2;
	}
	int subtraction(int number1, int number2) {
		return number1-number2;
	}
	double division(int number1, int number2) {
		if(number2==0)
			throw new ArithmeticException();
		double result = number1/number2;
		return result;
	}
	int multiplication(int number1, int number2) {
		return number1*number2;
	}

}
