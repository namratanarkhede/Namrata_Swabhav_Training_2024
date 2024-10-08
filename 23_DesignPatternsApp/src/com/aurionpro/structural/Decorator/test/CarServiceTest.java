package com.aurionpro.structural.Decorator.test;

import com.aurionpro.structural.Decorator.model.CarInspection;
import com.aurionpro.structural.Decorator.model.CarServiceDecorator;
import com.aurionpro.structural.Decorator.model.ICarService;
import com.aurionpro.structural.Decorator.model.OilChange;
import com.aurionpro.structural.Decorator.model.WheelAlign;

public class CarServiceTest {
	public static void main(String[] args) {
		ICarService  car = new CarInspection();
		OilChange carOil = new OilChange(car);
		System.out.println("Cost of only oil change");
		System.out.println(carOil.getCost());
		
		System.out.println("\nCost of oil change and wheel align");

		WheelAlign carWheel = new WheelAlign(carOil);
		System.out.println(carWheel.getCost());
		
		System.out.println("\nCost of only wheel align");
		WheelAlign carWheelOnli = new WheelAlign(car);
		System.out.println(carWheelOnli.getCost());
	}
	
	
	

}
