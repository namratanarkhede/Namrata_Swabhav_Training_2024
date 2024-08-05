package com.aurionpro.test;

public class WrapperClass {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a + ((Object)a).getClass().getSimpleName());
		Integer aObj =new Integer(a); //Autoboxing
		System.out.println(aObj+ ((Object)aObj).getClass().getSimpleName());
		
	}

}
