package com.aurionpro.ocpviolation.test;

import com.aurionpro.ocpviolation.model.Circle;
import com.aurionpro.ocpviolation.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.area();
		
		Rectangle rectangle = new Rectangle(4, 5);
		rectangle.area();
		
		
	}
}
