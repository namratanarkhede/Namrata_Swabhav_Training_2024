package com.aurionpro.test;

import com.aurionpro.model.Circle;

//interface is blueprint of class
//all methods in interface is without body or defination
//Achieve the full abstraction
//the variables should be public, static and final
//one interface can extend another interface.
//interface can refer to object of subclass
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;

public class ShapeTest {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		circle.area();
		
		Rectangle rectangle = new Rectangle(3,4);
		rectangle.area();
		
		Shape shape;
		shape = new Circle(45);
		shape.area();
		
		shape = new Rectangle(3,4);
		shape.area();
		
		shape.volume();
		
		Shape.perimeter();
	}

}
