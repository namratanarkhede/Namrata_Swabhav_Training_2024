package com.aurionpro.ispviolation.test;

import com.aurionpro.ispviolation.model.Loader;
import com.aurionpro.ispviolation.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {

		System.out.println("Loader doing");
		Loader loader = new Loader();
		loader.print();
		
		System.out.println("\nRobot doing");
		Robot robot = new Robot();
		robot.print();
		
	}
	
	

}
