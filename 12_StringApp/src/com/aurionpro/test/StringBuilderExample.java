package com.aurionpro.test;

//StringBuilder is mutable
public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("Namrata");
		System.out.println(name.hashCode());
		name = name.append("Narkhede");
		System.out.println(name.hashCode());
		
		
	}

}
