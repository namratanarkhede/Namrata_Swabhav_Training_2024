package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jayesh","Nimesh","Mark", "Mahesh", "Ramesh");
		
		
		System.out.println("\n1.First 3 students sorted in ascending order.");
		List<String> sorted3Names =names.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(sorted3Names);
		
		System.out.println("\n2.First 3 students sorted in asecending order and contains 'a'");
		List<String> sorted3NameContainsA =names.stream().filter(name->name.toLowerCase().contains("a"))
				.sorted()
				.limit(3)
				.collect(Collectors.toList());
	
		System.out.println(sorted3NameContainsA);
		
		System.out.println("\n3.Student in decending order");
		List<String> desendingOrder =names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println( desendingOrder);
		
		System.out.println("\n4. First 3 characters of all names ");
		List<String> first3Char =names.stream()
				.map(name->name.substring(0,Math.min(name.length(),3)))
				.collect(Collectors.toList());
		System.out.println(first3Char);
		
		
		System.out.println("\n5.Name of students that contains less than or equal to 4 character");
		List<String> nameWith4Char = names.stream()
				.filter(name -> name.length()<=4)
				.collect(Collectors.toList());
		System.out.println(nameWith4Char);
		
	}

}
