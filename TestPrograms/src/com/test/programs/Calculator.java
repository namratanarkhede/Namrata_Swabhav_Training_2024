package com.test.programs;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Calculator sc = new Calculator();
		
		System.out.println("Addition::"+sc.add(12, 12));
	}

}
