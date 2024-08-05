package com.aurionpro.test;

import java.util.function.Supplier;
//2. Supplier => return some value but does not accept any argument 
//		get();
public class SupplierTest {
	public static void main(String[] args) {
		Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random()*1000);
		System.out.println("The Random Number generated: " +randomNumberSupplier.get());
		
		
	
	}

}
