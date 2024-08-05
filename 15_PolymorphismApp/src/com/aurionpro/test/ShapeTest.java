package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		Circle circleArea = new Circle(5);
		circleArea.area();
		
		Rectangle rectangleArea = new Rectangle(5, 6);
		rectangleArea.area();
		
		Triangle triangleArea = new Triangle(4, 5);
		triangleArea.area();
		
		Shape shape;
		shape = new Circle(5);
		shape.area();
		
		shape = new Rectangle(15,25);
		shape.area();
		
				
	}

}
