package com.aurionpro.map;

import java.util.Comparator;

import com.aurionpro.list.model.Student;

public class StudentComparator {

	public static class StudentRollNumberComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			//if student1 > student2 = positive value
			//if student2> student1 = negative value
			//if both equal return 0
			return student1.getRollNumber()-student2.getRollNumber();
		}


	}
	public static class StudentNameComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
			
			return student1.getName().compareTo(student2.getName());
		}

	}

	

	public static class StudentPercentageComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			//if student1 > student2 = positive value
			//if student2> student1 = negative value
			//if both equal return 0
			
			if(student1.getPercentage()>student2.getPercentage()) 
				return 1;
			if(student1.getPercentage()<student2.getPercentage())
				return -1;
			return 0;
		}
	}
}
