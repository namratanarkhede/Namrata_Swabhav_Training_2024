package com.aurionpro.test;


//////super class referance can refer to subclass object.
// only inheritae the same method which are present in parent

import com.aurionpro.model.Base;
import com.aurionpro.model.Derived1;
import com.aurionpro.model.Derived2;


public class BaseTest {
	public static void main(String[] args) {
		Base base = new Base();
		base.display();
		
		base = new Derived1();
		base.display();
		
		base = new Derived2();
		base.display();
	}

}
