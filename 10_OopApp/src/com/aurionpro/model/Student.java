package com.aurionpro.model;

public class Student {
	private int studentRollNo;
	private String studentName;
	private int age;
	private double percentage;
	
	public void setStudentRollNo(int studentrollno) {
		studentRollNo = studentrollno;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	
	public void setStudentName(String studentname) {
		studentName = studentname;
	}
	public String setStudentName() {
		return studentName;
	}
	
	public void setAge(int studentage) {
		age = studentage;
	}
	public int getAge() {
		return age;
	}
	
	public void setPercentage(double studentpercentage) {
		percentage = studentpercentage;
	}
	public double getPercentage() {
		return percentage;
	}
	public void StudentDetails(){
		System.out.println("The roll no of the student "+ studentRollNo);
		System.out.println("The Name of student : " + studentName);
		System.out.println("The age of student : "+ age);
		System.out.println("The percentage of stduent : "+ percentage);
	
	}
	
}
