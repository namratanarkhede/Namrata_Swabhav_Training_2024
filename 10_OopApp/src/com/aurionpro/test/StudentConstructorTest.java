package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.StudentConstructor;

public class StudentConstructorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentConstructor StudentConstructor = new StudentConstructor();
		StudentConstructor.getStudentRollNo();
		StudentConstructor.getStudentName();
		StudentConstructor.getAge();
		StudentConstructor.getPercentage();
		StudentConstructor.StudentDetails();
		
//		System.out.println("Enter the roll no : ");
//		int studentrollno=sc.nextInt();
//		
//		System.out.println("Eneter the name");
//		String studentname = sc.next(); 
//		
//		System.out.println("Enter the age");
//		int studentage = sc.nextInt();
//		
//		System.out.println("Enter the percentage");
//		double studentpercentage = sc.nextDouble();
		StudentConstructor StudentConstructor2 =new StudentConstructor(2,"Vidul Bhosale",23 ,89.20);
		
		StudentConstructor2.getStudentRollNo();
		StudentConstructor2.getStudentName();
		StudentConstructor2.getAge();
		StudentConstructor2.getPercentage();
		StudentConstructor2.StudentDetails();

	}

}
