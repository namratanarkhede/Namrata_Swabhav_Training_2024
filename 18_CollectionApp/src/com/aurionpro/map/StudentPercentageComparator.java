package com.aurionpro.map;

import java.util.Comparator;

import com.aurionpro.list.model.Student;

public class StudentPercentageComparator implements Comparator<Student>{

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
