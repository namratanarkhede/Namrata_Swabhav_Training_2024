package com.aurionpro.test;
//for static datamembers memory allocated only once.


// static is property of class and not object.

//use = to persist the value throughout the application.

//static method can acess only static members only.
import com.aurionpro.model.Demo;
public class DemoTest {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.display();
		Demo.increment(); 
		d1.display();
		
		Demo d2 = new Demo();
		d2.display();
		Demo.increment();
		d2.display();
		
		Demo d3 = new Demo();
		d3.display();
		Demo.increment();
		d3.display();
	}
	//static block executes when the class is loaded even before the main method.
	static
	{
		System.out.println("Nams Nams");
	}
}
