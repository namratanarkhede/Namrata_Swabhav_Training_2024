package com.aurionpro.model;


public class Box {
	private int width;
	
	private int height;
	
	private int depth;
//	public void display() {
//		System.out.println("The width of box is : " +width);
//		System.out.println("The width of box is : " +height);
//		System.out.println("The width of box is : " +depth);
//
//		
//	}
	//public void Initialize(int h, int w, int d){
	//	this.height = h;
	//	this.width = w;
	//	this.depth = d;
	//}
	
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
