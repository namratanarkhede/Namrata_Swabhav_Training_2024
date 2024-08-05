package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BoxConstructor;

public class BoxConstructorTest {

	public static void main(String[] args) {
		BoxConstructor box = new BoxConstructor();
		System.out.println("BOX");
		System.out.println("Width : "+box.getWidth());
		System.out.println("Height : "+box.getHeight());
		System.out.println("Depth : "+box.getDepth());
		
		System.out.println("----------------------------------");
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width");
		int w = sc.nextInt();
		System.out.println("Enter the height");
		int h = sc.nextInt();
		System.out.println("Enter the depth");
		int d = sc.nextInt();
		BoxConstructor box2 = new BoxConstructor(w,h,d);
		System.out.println("BOX2");
		System.out.println("Width : "+box2.getWidth());
		System.out.println("Height : "+box2.getHeight());
		System.out.println("Depth : "+box2.getDepth());

		
		
	}
}
