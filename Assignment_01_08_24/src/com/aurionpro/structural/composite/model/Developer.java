package com.aurionpro.structural.composite.model;

public class Developer implements Employee{

	private String name;
	private String position;
	private double salary;
	
	
	public Developer(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}


	@Override
	public void showEmployeeDetails() {
		System.out.println("Name: "+name+"\nPosition: "+ position+"\nSalary: $" +salary);
	}

}
