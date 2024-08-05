package com.aurionpro.map;

import com.aurionpro.list.model.Student;
import java.util.Comparator;

public class StudentRollNumberComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		//if student1 > student2 = positive value
		//if student2> student1 = negative value
		//if both equal return 0
		return student1.getRollNumber()-student2.getRollNumber();
	}


}
