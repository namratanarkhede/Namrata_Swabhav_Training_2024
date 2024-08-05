package com.aurionpro.structural.composite.test;

import com.aurionpro.structural.composite.model.Designer;
import com.aurionpro.structural.composite.model.Developer;
import com.aurionpro.structural.composite.model.Employee;
import com.aurionpro.structural.composite.model.Manager;

public class ManagerTest {
	public static void main(String[] args) {
		 Employee dev1 = new Developer("Namrata", "Software Developer", 450000);
	     Employee dev2 = new Developer("Bob", "Backend Developer", 700000);
	     Employee designer = new Designer("Charlie", "UX Designer", 500000);

	     Manager manager1 = new Manager("Dave", "Project Manager", 1000000);
	     manager1.addEmployee(dev1);
	     manager1.addEmployee(dev2);

	     Manager generalManager = new Manager("Eve", "General Manager", 2500000);
	     generalManager.addEmployee(manager1);
	     generalManager.addEmployee(designer);

	     System.out.println("Company Hierarchy:");
	     generalManager.showEmployeeDetails();
	}

}
