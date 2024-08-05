package com.aurionpro.model;

public class StudentConstructor {
	private int studentRollNo;
	private String studentName;
	private int age;
	private double percentage;
	
	
	public StudentConstructor() {
		this.studentRollNo= 1;
		this.studentName ="Namrata Narkhede";
		this.age = 23;
		this.percentage= 87.23;
	}
	public StudentConstructor(int studentrollno, String studentname, int studentage, double studentpercentage) {
		//always refer to current object
		this.studentRollNo= studentrollno;
		this.studentName =studentname;
		this.age = studentage;
		this.percentage= studentpercentage;
		
	}
	
	public void setStudentRollNo(int studentrollno) {
		this.studentRollNo = studentrollno;
	}
	public int getStudentRollNo() {
		return this.studentRollNo;
	}
	
	public void setStudentName(String studentname) {
		this.studentName = studentname;
	}
	public String getStudentName() {
		return this.studentName;
	}
	
	public void setAge(int studentage) {
		this.age = studentage;
	}
	public int getAge() {
		return this.age;
	}
	
	public void setPercentage(double studentpercentage) {
		this.percentage = studentpercentage;
	}
	public double getPercentage() {
		return this.percentage;
	}
	public void StudentDetails(){
		System.out.println("The roll no of the student "+ this.studentRollNo);
		System.out.println("The Name of student : " + this.studentName);
		System.out.println("The age of student : "+ this.age);
		System.out.println("The percentage of stduent : "+ this.percentage);
		System.out.println("-----------------------------------------------------");
	
	}

}
