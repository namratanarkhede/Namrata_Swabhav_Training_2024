package com.aurionpro.test;

//StringBuffer is mutable
public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("Namrata");
		System.out.println(name.hashCode());
		name = name.append("Narkhede");
		System.out.println(name.hashCode());
		
		
	}

}
