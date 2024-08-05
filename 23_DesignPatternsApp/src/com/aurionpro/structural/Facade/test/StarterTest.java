package com.aurionpro.structural.Facade.test;

import com.aurionpro.structural.Facade.model.Starter;

public class StarterTest {
	public static void main(String[] args) {
		Starter start = new Starter();
		System.out.println("DVD Started");
		start.startDVD();
		
		System.out.println("\nProjector Started");
		start.startProjector();
		
		System.out.println("\nSoundSystem Started");
		start.startSoundSystem();
	}

}
