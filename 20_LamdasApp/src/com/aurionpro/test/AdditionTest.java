package com.aurionpro.test;

import com.aurionpro.model.Iaddition;

public class AdditionTest {

	public static void main(String[] args) {
		
		Iaddition adder = (int number1, int number2) -> number1+number2;

		System.out.println(adder.addition(10, 20));
	}

}
