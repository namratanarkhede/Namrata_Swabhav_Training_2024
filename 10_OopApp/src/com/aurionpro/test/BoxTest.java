package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Box;

//Object name which refer to object creates the memory in stack memory
//Object created the memory in heap memory
public class BoxTest {
	public static void main(String[] args) {
		Box box = new Box();

		System.out.println("BOX");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width");
		int w = sc.nextInt();
		box.setWidth(w);
		System.out.println("Enter the height");
		int h = sc.nextInt();
		box.setHeight(h);
		System.out.println("Enter the depth");
		int d = sc.nextInt();
		box.setDepth(d);
		
		System.out.println("Width : "+box.getWidth());
		System.out.println("Height : "+box.getHeight());
		System.out.println("Depth : "+box.getDepth());

		
		
	}

}
