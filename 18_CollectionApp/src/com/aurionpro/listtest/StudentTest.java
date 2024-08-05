package com.aurionpro.listtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		System.out.println("Enter the number of students u want to add: ");
		int n = sc.nextInt();
		readStudent(students, sc,n);
		printStudentDetails(students);
		
		
		
		
	}
	private static void readStudent(List<Student> students, Scanner sc, int n) {
		System.out.println("Enter the details of student");
		for(int i = 0; i <n ; i++) {
			System.out.println("Enter the roll no : ");
			int rollNumber = sc.nextInt();
			System.out.println("Enter the name: ");
			String name = sc.next();
			System.out.println("Enter the percentage : ");
			double percentage = sc.nextDouble();
			students.add(new Student(rollNumber,name,percentage));
		}

		sc.close();
		
	}
	private static void printStudentDetails(List<Student> students) {
		for(Student student: students) {
			System.out.println(student);
		}
	}

}
