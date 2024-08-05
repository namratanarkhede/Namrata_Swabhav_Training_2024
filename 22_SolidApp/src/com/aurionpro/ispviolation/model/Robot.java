package com.aurionpro.ispviolation.model;

public class Robot implements IWorkable{

	@Override
	public void start() {
		System.out.println("Robot Started");
	}

	@Override
	public void stop() {
		System.out.println("Robot Stoped");
	}

	public void print() {
		start();
		stop();
	}
}
