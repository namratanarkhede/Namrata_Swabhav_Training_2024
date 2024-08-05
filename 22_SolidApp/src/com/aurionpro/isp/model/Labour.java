package com.aurionpro.isp.model;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		System.out.println("The Labour started the work");
	}

	@Override
	public void stopWork() {
		System.out.println("The Labour stops the work");
		
	}

	@Override
	public void eat() {
		System.out.println("Labour eating");
		
	}

	@Override
	public void drink() {
		System.out.println("Labour drinking");
		
	}


	public void print() {
		startWork();
		stopWork();
		eat();
		drink();
	}

}
