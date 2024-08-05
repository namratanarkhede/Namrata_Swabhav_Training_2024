package com.aurionpro.isp.model;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Robot started work");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stoped work");
		
	}

	@Override
	public void eat() {
		System.out.println("Robot can't eat make different interface");
		
	}

	@Override
	public void drink() {
		System.out.println("Robot can't drink man!! make different interface");
		
	}
	
	public void print() {
		startWork();
		stopWork();
		eat();
		drink();
	}

}
