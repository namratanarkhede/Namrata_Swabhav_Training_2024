package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Student;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter the Roll Number of Student");
		int studentrollno = sc.nextInt();
		student.setStudentRollNo(studentrollno);
		System.out.println("Enter the Name of Student");
		String studentname = sc.next();
		student.setStudentName(studentname);
		System.out.println("Enter the age of Student");
		int studentage =  sc.nextInt();
		student.setAge(studentage);
		System.out.println("Enter the percentage of Student");
		double studentpercentage = sc.nextDouble();
		student.setPercentage(studentpercentage);
		
		student.StudentDetails();
		Student student2 = new Student();
		
		System.out.println("Enter the Roll Number of Student");
		studentrollno = sc.nextInt();
		student2.setStudentRollNo(studentrollno);
		System.out.println("Enter the Name of Student");
		studentname = sc.next();
		student2.setStudentName(studentname);
		System.out.println("Enter the age of Student");
		studentage =  sc.nextInt();
		student2.setAge(studentage);
		System.out.println("Enter the percentage of Student");
		studentpercentage = sc.nextDouble();
		student2.setPercentage(studentpercentage);
		
		student2.StudentDetails();
		
	}

}
