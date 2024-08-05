package com.aurionpro.structural.proxy.test;

import com.aurionpro.structural.proxy.model.Image;
import com.aurionpro.structural.proxy.model.ProxyImage;

public class ProxyTest {
	public static void main(String[] args) {
		Image image1 = new ProxyImage("photo1.jpg");

		System.out.println("Image Loaded from disk only when display() is called");
		image1.display();
		System.out.println("\nThis time it will not load from disk");
		image1.display();

	}

}
