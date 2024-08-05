package com.aurionpro.test;

public class TypeCasting {

	public static void main(String[] args) {

		int a= (int) 10.5;
		
		byte b =10;
		//byte c= a + 10; 
		// type promotion // a is byte store 1 , 10 is int store 4 // 1 < 4 = changes the expression in int
		//but again problem is c is byte and value is int 
		//so we get error that's y we do typecasting
		
		byte d = (byte) ( a + 10);
	}

}
