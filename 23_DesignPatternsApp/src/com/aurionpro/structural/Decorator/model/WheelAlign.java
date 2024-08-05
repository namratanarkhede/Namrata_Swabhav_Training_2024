package com.aurionpro.structural.Decorator.model;

public class WheelAlign extends CarServiceDecorator{

	public WheelAlign(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getCost() {
		return 100+super.getCost();
		
	}

}
