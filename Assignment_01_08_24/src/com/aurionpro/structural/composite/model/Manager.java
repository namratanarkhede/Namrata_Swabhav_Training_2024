package com.aurionpro.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
	private String name;
	private String position;
	private double salary;
	private List<Employee> employees = new ArrayList<>();
	
	public Manager(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}


	@Override
	public void showEmployeeDetails() {
		System.out.println("Name: "+name+"\nPosition: "+ position+"\nSalary: $" +salary);
		for(Employee employee: employees) {
			employee.showEmployeeDetails();
		}
	}
	

}
