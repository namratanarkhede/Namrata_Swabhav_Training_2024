package com.aurionpro.behavioral.strategy.model;

public class DivisionOperation implements IOperation{

	@Override
	public int doOperation(int number1, int number2) {
		if(number2==0)
			return 0;
		return number1/number2;
	}

	
}
