package com.aurionpro.creational.adstractfactory.model;

public class MahindraFactory implements ICarFactory{

	@Override
	public ICars makeCar() {
		// TODO Auto-generated method stub
		return new Mahindra();
	}
	

}
