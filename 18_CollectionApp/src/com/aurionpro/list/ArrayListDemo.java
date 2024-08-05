package com.aurionpro.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//
//Array 
//disadvantages:
//1.size of array is fixed
//2.array can not grow or shrink at runtime.
//3.array requires a contigeous memory block
//To overcome this disadvantages we go with collections.
//
//Collections => group of objects
//
//- A collection framework is used to manage a group of object in efficient way.
//framework is nothing but set of classes, methods to manage the some problem.
//
//- all framework is collected in one package - java.util
//- Iterable (interface) => Collection (sub-interface) =>sub-interfaces 1. List 2. Queue 3. Set
//
//-1.List => ArrayList (dynamic array), LinkedList, Vector -> Stack
//When we want repeatation of object, and if we want to manage with index then go for list.
//-2.Queue => PriorityQueue, DeQueue
//-3.Set => HashSet, LinkedHashSet, SortedSet -> TreeSet
//when we don't want the repeatation object and not want index then go with set.
//
//Interator, ListIterator
//Comprator
//
//smililar to set. according to structure only. but manage in different way.
//Map => HashMap, LinkedHashMap, SortedMap -> TreeMap
import java.util.ListIterator;

//List => ArrayList (dynamic array)

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//another way to create the list
		List<Integer> integers = Arrays.asList(10,20,30,40,59);
		list.add("Nams");
		list.add("Vidulii");

		System.out.println(list);
		//to access the element in array
		//using for loop
		System.out.println("\nUsing For loop");
		for(int i = 0; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		//using advance for loop
		System.out.println("\nUsing advance for loop");
		for(String name:list) {
			System.out.println(name);
		}
		
		//using the iterator interface
		System.out.println("\nUsing the iterator");
		Iterator<String> iterator  = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//using ListIterator
		System.out.println("\nUsing the ListIterator");
		ListIterator listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
//		
//
//		System.out.println(list.hashCode());
//		System.out.println(list.contains("Nams"));
//		list.set(0, "Namrata");
//		System.out.println(list);
//		System.out.println(list.size());
	}
	

}
