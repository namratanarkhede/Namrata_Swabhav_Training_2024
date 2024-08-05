package com.aurionpro.test;

import com.aurionpro.model.Itest;
import com.aurionpro.model.Reference;

public class ReferenceTest {

	public static void main(String[] args) {
		
		//to call constructor
		Itest test = Reference::new;		
		method(test);
		
		//to call the static method
		Itest test1 = Reference::staticPrint;
		method(test1);
		
		//to call the non-static method
		Reference reference = new Reference();
		Itest test2 = reference::print;
		method(test2);
		
		

	}
	private static void method(Itest test) {
		test.display();
	};

}
