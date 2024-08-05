package com.aurionpro.model;

public class Box {

	private Integer width;
	private Integer height;
	private Integer depth;
	public Box(Integer width, Integer height, Integer depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
}
