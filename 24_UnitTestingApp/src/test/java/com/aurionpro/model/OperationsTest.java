package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operations;
	
	@BeforeEach
	// @BeforeAll => create object before exexiting all the methods which we were testing.
	//creates the object before executing each method which we were testing
	void init() {
		operations =new Operations();
	}
	
	@AfterEach
	void status() {
		System.out.println("Test executed");
	}

	@Test
	void testAddition() {
		
		//function in junit test to check is expected and actual is same.
		assertEquals(10, operations.addition(5, 5), "This function must do addition.");
	}
	
	@Test
	void testSubtraction() {
		
		//function in junit test to check is expected and actual is same.
		assertEquals(0, operations.subtraction(5, 5), "This function must do subtraction.");
	}
	
	@Test
	void testDivision() {
		
		//function in junit test to check is expected and actual is same.
		
		assertEquals(1, operations.division(5, 5), "This function must do division.");
		assertThrows(ArithmeticException.class,()-> operations.division(5, 0));
	}
	
	@Test
	void testMultiplication() {
		
		//function in junit test to check is expected and actual is same.
		assertEquals(25, operations.multiplication(5, 5), "This function must do multiply.");
		
	}
	

}
