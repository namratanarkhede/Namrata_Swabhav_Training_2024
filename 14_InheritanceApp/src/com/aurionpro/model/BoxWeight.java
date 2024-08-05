package com.aurionpro.model;

public class BoxWeight extends Box{

	private Integer weigth;

	public BoxWeight(Integer width, Integer height, Integer depth, Integer weigth) {
		super(width, height, depth); //to call the parent constructor.
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "BoxWeight [weigth=" + weigth + ", Width=" + getWidth() + ", Height=" + getHeight()
				+ ", Depth=" + getDepth()+ "]";
	}

}
