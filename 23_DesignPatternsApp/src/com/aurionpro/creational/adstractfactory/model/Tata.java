package com.aurionpro.creational.adstractfactory.model;

public class Tata implements ICars{

	@Override
	public void start() {
		System.out.println("Tata Car Startes");
	}

	@Override
	public void stop() {	
		System.out.println("Tata Car stops");
	}

}
