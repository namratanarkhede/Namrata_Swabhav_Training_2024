package com.aurionpro.settest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Linkedhash set maintain the insertion order of element.
public class HashSetExample {

	public static void main(String[] args) {
		System.out.println("---------HashSet----------");
		HashSet<String> set = new HashSet<String>();
		
		set.add("Namrata");
		set.add("Sayali");
		set.add("Neha");
		set.add("Neha");
		
		System.out.println(set);
		
		System.out.println("---------TreeSet----------");
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Namrata");
		set1.add("Sayali");
		set1.add("Neha");
		set1.add("Neha");
		System.out.println(set1);
		
		
		System.out.println("---------LinkedHashSet----------");
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("Namrata");
		set2.add("Sayali");
		set2.add("Neha");
		set2.add("Neha");
		System.out.println(set2);
		
		
	}
}
