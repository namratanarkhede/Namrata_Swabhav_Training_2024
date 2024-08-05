package com.aurionpro.structural.decorator.model;

public class RibbonedHat extends HatDecorator {

	public RibbonedHat(PremiumHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Ribboned Hat" + hat.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription();
	}
	
	

}
