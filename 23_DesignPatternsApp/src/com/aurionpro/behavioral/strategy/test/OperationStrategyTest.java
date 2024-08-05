package com.aurionpro.behavioral.strategy.test;

import java.util.Scanner;

import com.aurionpro.behavioral.strategy.model.AddOperation;
import com.aurionpro.behavioral.strategy.model.MultiplyOperation;
import com.aurionpro.behavioral.strategy.model.OperationStrategy;

public class OperationStrategyTest {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OperationStrategy op = new OperationStrategy(new AddOperation());
		
		System.out.println("Enter the number1 : ");
		int number1 =sc.nextInt();
		System.out.println("Enter the number2 : ");
		int number2 = sc.nextInt();
		System.out.println("Addition Operation");
		op.doOperation(number1, number2);
		
		System.out.println("Changed to Multiplication");
		op.setOperation(new MultiplyOperation());
		op.doOperation(number1, number2);
	}
	
}
