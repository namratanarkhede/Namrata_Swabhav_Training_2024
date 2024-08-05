package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.EmployeeConstructor;

public class EmployeesDetailss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employess details you want to ad : '");
		int n = sc.nextInt();
		
		EmployeeConstructor emps[]  = new EmployeeConstructor[n];
		System.out.println("Enter the details of player");
		for (int i =0; i < emps.length; i++ ) {
			System.out.println("Enter the ID of Employee : ");
			int employeeId = sc.nextInt();
			sc.nextLine();  
			
			System.out.println("Enter the Name of Employee : ");
			String name = sc.nextLine();  
			
			System.out.println("Enter the Salary of Employee : ");
			int salary = sc.nextInt();
			

			emps[i] = new EmployeeConstructor(employeeId, name, salary);
			
		}
		
		for (int i =0; i < emps.length; i++ ) {
		
			emps[i].showDetails();
		
		}
	}

}
