package com.aurionpro.creational.adstractfactory.model;

public class Maruti implements ICars{

	@Override
	public void start() {
		System.out.println("Maruti car Starts");
	}

	@Override
	public void stop() {
		System.out.println("Maruti car Stoped");
	}

}
