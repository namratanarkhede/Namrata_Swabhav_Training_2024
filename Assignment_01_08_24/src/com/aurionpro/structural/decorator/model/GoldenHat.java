package com.aurionpro.structural.decorator.model;


public class GoldenHat extends HatDecorator{

	public GoldenHat(StandardHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Golden Hat" + hat.getName();
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
