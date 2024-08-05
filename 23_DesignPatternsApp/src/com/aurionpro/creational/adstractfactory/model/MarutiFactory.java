package com.aurionpro.creational.adstractfactory.model;

import com.aurionpro.creational.factory.model.ICar;

public class MarutiFactory implements ICarFactory {

	@Override
	public ICars makeCar() {
		return new Maruti();
	}
	

}
