package com.aurionpro.behavioral.strategy.model;

public class OperationStrategy {

	IOperation operation;

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}

	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;
	}
	
	public void doOperation(int number1, int number2) {
		System.out.println(operation.doOperation(number1, number2));
	}
	
}
