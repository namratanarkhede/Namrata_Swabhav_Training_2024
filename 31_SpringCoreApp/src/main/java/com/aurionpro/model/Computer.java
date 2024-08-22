package com.aurionpro.model;

public class Computer {
	
	private String name;
	
	private Hardisk hardisk;

	public Computer() {
		System.out.println("Inside Computer Default Constructor");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hardisk getHardisk() {
		return hardisk;
	}

	public void setHardisk(Hardisk hardisk) {
		System.out.println("Inside Computer set Hardisk");

		this.hardisk = hardisk;
	}

	public Computer(String name, Hardisk hardisk) {
		super();
		System.out.println("Inside computer parameterised constructor");
		this.name = name;
		this.hardisk = hardisk;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", hardisk=" + hardisk + "]";
	}
	
	

}
