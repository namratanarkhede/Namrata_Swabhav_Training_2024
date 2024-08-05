package com.aurionpro.test;

import java.util.function.BiFunction;
import java.util.function.Function;
//3. Function => It takes one argument and returns one value.
//apply();
// BiFunction


//defination of the method as a argument to another method

public class FunctionTest {
	public static void main(String[] args) {

		Function<Integer, Integer> squareFunction =(Integer number)-> number*number;
		
		System.out.println(squareFunction.apply(5));
		
		BiFunction<Integer, Integer, Double> additionFunction = (Integer number1, Integer number2) ->(double) (number1+number2);
	
		System.out.println(additionFunction.apply(10, 20));
	}
	
}
