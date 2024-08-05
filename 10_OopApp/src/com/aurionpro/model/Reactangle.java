package com.aurionpro.model;

import java.util.Scanner;

public class Reactangle {
	
	private int length;
	
	private int width;
	
	public void setLength(int l) {
		length = l;
		
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int w) {
		width =w;
	}
	public int getWidth() {
		return width;
	}
	
	public void area(){
		System.out.println("The area of reactangle : " + length*width);
	
	}

}
