package com.aurionpro.list;

import java.util.LinkedList;

// LinkedList => collection of nodes.
// in java by default doubly linked list.
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Namrata");
		list.add("Neha");
		list.addFirst("Sayali");
		list.addLast("Aagya");
		
		
		for(String name:list) {
			System.out.println(name);
		}
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.getLast());
	}

}
