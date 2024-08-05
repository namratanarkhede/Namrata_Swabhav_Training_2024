package com.aurionpro.map;

import java.util.Comparator;

import com.aurionpro.list.model.Student;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		
		return student1.getName().compareTo(student2.getName());
	}

}
