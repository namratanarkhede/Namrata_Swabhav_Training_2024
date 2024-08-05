package com.aurionpro.creational.factory.test;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.aurionpro.creational.factory.model.ICar;
import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Maruti;
import com.aurionpro.creational.factory.model.Tata;

public class CarTest {

	public static void main(String[] args) {
		ICar car;
		
		System.out.println("Mahindra Car");
		car= new Mahindra();
		car.start();
		car.stop();
		
		System.out.println("\nTata Car");
		car= new Tata();
		car.start();
		car.stop();
		
		System.out.println("\nMaruti Car");
		car = new Maruti();
		car.start();
		car.stop();
		
	}
}
