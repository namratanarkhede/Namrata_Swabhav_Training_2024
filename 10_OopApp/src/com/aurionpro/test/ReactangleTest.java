package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Reactangle;

public class ReactangleTest {
	public static void main(String[] args) {
		Reactangle rectangle = new Reactangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of reactangle : ");
		int l = sc.nextInt();
		rectangle.setLength(l);
		System.out.println("Enter the width of reactangle : ");
		int w = sc.nextInt();
		rectangle.setWidth(w);
		

	
		System.out.println("Reactangle");

		System.out.println("The length of rectangle : "+rectangle.getLength());
		System.out.println("The width of rectangle : "+ rectangle.getWidth());
		rectangle.area();
	}

}
