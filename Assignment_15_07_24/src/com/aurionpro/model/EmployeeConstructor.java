package com.aurionpro.model;

public class EmployeeConstructor {

	private int employeeId ;
	private String name;
	private int salary;
	
	public EmployeeConstructor(int employeeId,String name, int salary) {
		this.employeeId = employeeId;
		this.name =name;
		this.salary = salary;
	}
	
	public void setEmployeeId(int empID) {
		employeeId = empID;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeName(String empName) {
		name = empName;
	}
	public String getEmployeeName() {
		return name;
	}

	public void setEmployeeSalary(int empSalary) {
		salary = empSalary;
	}
	public int getEmployeeSalary() {
		return salary;
	}
	
	public void showDetails() {
		System.out.println("ID : " + employeeId);
		System.out.println("Name : "+ name);
		System.out.println("Salary : " + salary);
		
		System.out.println("-----------------------------------------");
	}

}
