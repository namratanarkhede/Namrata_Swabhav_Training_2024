package com.aurionpro.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
//1. Consumer => Accepts only one argument and does not return anything.
//        void accept(T t); //method of Consumer Interface.

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<Integer> squareConsumer = (Integer number) ->System.out.println("Square of number : "+number*number);

		
		Consumer<Integer> factorialConsumer = (Integer number) ->{ 
				Integer result = 1;
				for(int i = 2; i<=number ; i++) {
					result *= i;
				}
				System.out.println("Factorial is " + result);
			};
			
		BiConsumer<Integer, Integer> additionConsumer = (Integer number1, Integer number2) -> {
			System.out.println("The addition of two numbers : "+(number1+number2));
			
		};
		additionConsumer.accept(3, 4);
		squareConsumer.accept(10);
		factorialConsumer.accept(4);
	}

}
