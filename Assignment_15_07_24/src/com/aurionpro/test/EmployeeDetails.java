package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter the ID of Employee : ");
		int empID = sc.nextInt();
		emp.setEmployeeId(empID);
		sc.nextLine();  
		
		System.out.println("Enter the Name of Employee : ");
		String empName = sc.nextLine();  
		emp.setEmployeeName(empName);
		
		System.out.println("Enter the Salary of Employee : ");
		int empSalary = sc.nextInt();
		emp.setEmployeeSalary(empSalary);
		
		emp.showDetails();
		
		
		Employee emp2 = new Employee();
		
		System.out.println("Enter the ID of Employee : ");
		empID = sc.nextInt();
		emp2.setEmployeeId(empID);
		sc.nextLine();  
		
		System.out.println("Enter the Name of Employee : ");
		empName = sc.nextLine();  
		emp2.setEmployeeName(empName);
		
		System.out.println("Enter the Salary of Employee : ");
		empSalary = sc.nextInt();
		emp2.setEmployeeSalary(empSalary);
		
		emp2.showDetails();
		sc.close();  
	}
}
