package com.aurionpro.maptest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Student;
import com.aurionpro.map.Employee;
import com.aurionpro.map.EmployeeComparator;
import com.aurionpro.map.StudentComparator;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();
		System.out.println("Enter the Employees You want to add : ");
		int n= sc.nextInt();
		
		readEmployee(employees, sc,n);
		System.out.println("\nThe Student Details\n");
		printEmployeeDetails(employees);
		
		System.out.println("\nSorted according to roll number \n");
		sortedEmployeeId(employees);
		
		System.out.println("\nSorted according to name \n");
		sortedEmployeeName(employees);
		
		System.out.println("\nSorted according to percentage");
		sortedEmployeeSalary(employees);
		
		
		
	}
	private static void sortedEmployeeSalary(List<Employee> employees) {
		Collections.sort(employees, new EmployeeComparator.EmployeeSalaryComparator());
		
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
	}
	private static void sortedEmployeeName(List<Employee> employees) {
		
		Collections.sort(employees, new EmployeeComparator.EmployeeNameComparator());
		
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
	}
	private static void sortedEmployeeId(List<Employee> employees) {
		
		Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
		
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
	}
	private static void printEmployeeDetails(List<Employee> employees) {
		for(Employee employee: employees) {
			System.out.println(employee);
		}
		
	}
	private static void readEmployee(List<Employee> employees, Scanner sc, int n) {
		System.out.println("Enter the details of employees");
		for(int i = 0; i <n ; i++) {
			System.out.println("Enter the employee ID : ");
			int employeeId = sc.nextInt();
			System.out.println("Enter the name: ");
			String name = sc.next();
			System.out.println("Enter the Salary : ");
			double salary = sc.nextDouble();
			employees.add(new Employee(employeeId, name, salary));
		
		
		}

		sc.close();
	}


}
