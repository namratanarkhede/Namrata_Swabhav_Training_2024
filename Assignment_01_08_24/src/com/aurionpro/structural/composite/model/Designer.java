package com.aurionpro.structural.composite.model;

public class Designer implements Employee{
	private String name;
	private String position;
	private double salary;
	
	
	public Designer(String name, String position, double salary) {
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
