package com.aurionpro.isp.test;

import com.aurionpro.isp.model.Labour;
import com.aurionpro.isp.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		System.out.println("For Labour");
		Labour labour = new Labour();
		labour.print();
		

		System.out.println("\nFor Robot");
		Robot robot = new Robot();
		robot.print();
	}

}
