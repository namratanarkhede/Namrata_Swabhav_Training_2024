package com.aurionpro.model;
//Constructor is the special member method of the class.
//constructor name should be same as the class name.
//constructor does not have return type.
//Initialize the object. automatically called when we create the object of the class.

//Two types
//Default constructor

//parameterized constructor
public class BoxConstructor {
	private int width;
	private int height;
	private int depth;
	
	public BoxConstructor() {
		width = 10;
		height =20;
		depth = 30;
	}


	public BoxConstructor(int w, int h, int d) {
		width = w;
		height =h;
		depth = d;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	public int getHeight() {
		return height;
	}
	
	
	public void setDepth(int d) {
		depth = d;
	}
	public int getDepth() {
		return depth;
	}
	
	

}
