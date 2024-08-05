package com.aurionpro.ispviolation.model;

public class Loader implements ILunchInterval, IWorkable {

	@Override
	public void eat() {
		System.out.println("Worker eat");
	}

	@Override
	public void rest() {
		System.out.println("Worker rest");
	}

	@Override
	public void start() {
		System.out.println("Worker start");
	}

	@Override
	public void stop() {
		System.out.println("Worker stop");
	}
	
	public void print() {
		
		eat();
		rest();
		start();
		stop();
	}

}
