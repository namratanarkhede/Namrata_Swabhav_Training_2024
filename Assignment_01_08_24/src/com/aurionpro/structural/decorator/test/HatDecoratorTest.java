package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.IHat;
import com.aurionpro.structural.decorator.model.PremiumHat;
import com.aurionpro.structural.decorator.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		IHat premiumHat =new PremiumHat();
		System.out.println("Premium hat details");
		System.out.println("Name: " + premiumHat.getName()+"\nPrice: $"+ premiumHat.getPrice()+"\nDescription: "+premiumHat.getDescription());
		
		
		IHat standradHat = new StandardHat();
		System.out.println("\nStandard hat details");
		System.out.println("Name: " + standradHat.getName()+"\nPrice: $"+ standradHat.getPrice()+"\nDescription: "+standradHat.getDescription());
	}
}
