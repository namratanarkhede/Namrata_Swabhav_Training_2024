package com.aurionpro.creational.adstractfactory.model;

public class Mahindra implements ICars{

	@Override
	public void start() {
		System.out.println("Mahindra car starts");
	}

	@Override
	public void stop() {
		System.out.println("Mahindra car stoped.");
	}
	

}
