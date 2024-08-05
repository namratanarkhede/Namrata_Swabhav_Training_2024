package com.aurionpro.maptest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Student;
import com.aurionpro.map.StudentComparator;
import com.aurionpro.map.StudentNameComparator;
import com.aurionpro.map.StudentPercentageComparator;
import com.aurionpro.map.StudentRollNumberComparator;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		System.out.println("Enter the number of students u want to add: ");
		int n = sc.nextInt();
		readStudent(students, sc,n);
		System.out.println("The Student Details\n");
		printStudentDetails(students);
		
		System.out.println("Sorted according to roll number \n");
		sortedStudentRollNumber(students);
		
		System.out.println("Sorted according to name \n");
		sortedStudentName(students);
		
		System.out.println("Sorted according to percentage");
		sortedStudentPercentage(students);
		
		
		
		
	}
	private static void sortedStudentPercentage(List<Student> students) {
		Collections.sort(students, new StudentComparator.StudentPercentageComparator());
		
		for(Student student:students) {
			System.out.println(student);
		}
		
	}
	private static void sortedStudentName(List<Student> students) {
		Collections.sort(students, new StudentComparator.StudentNameComparator());
		
		for(Student student:students) {
			System.out.println(student);
		}
		
	}
	private static void sortedStudentRollNumber(List<Student> students) {
		Collections.sort(students, new StudentComparator.StudentRollNumberComparator() );
		
		for(Student student:students) {
			System.out.println(student);
		}
		// TODO Auto-generated method stub
		
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
