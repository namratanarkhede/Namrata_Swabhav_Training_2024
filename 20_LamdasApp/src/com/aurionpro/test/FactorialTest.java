package com.aurionpro.test;

import com.aurionpro.model.IFactorial;

public class FactorialTest {

	public static void main(String[] args) {
		
		IFactorial fact = (int number1) -> {
			int result = 1;
			for(int i = 2; i <=  number1 ; i++) 
				result *=i;
			return result;
			};
		
		System.out.println(fact.factorial(5));
		
		
		
	}
}
