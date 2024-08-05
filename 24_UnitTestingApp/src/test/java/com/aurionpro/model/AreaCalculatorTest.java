package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
	AreaCalculator calculator;
	
	@BeforeEach
	void init() {
		calculator = new AreaCalculator();
	}
	
	@Test
	void testCalculateCircleArea() {
		assertEquals(78.5, calculator.calculateCircleArea(5));		
	}
	
	@Test
	void testCalculateRectangleArea() {
		assertEquals(25, calculator.calculateRactangleArea(5, 5));		

	}
	
	@Test
	void testCalculateTraingleArea() {
		assertEquals(12.5, calculator.calculateTraingleArea(5, 5));		
	}

}
