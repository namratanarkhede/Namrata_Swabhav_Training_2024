package com.aurionpro.test;

import com.aurionpro.model.ISayable;

public class Speaker {
	private ISayable sayable;
	public Speaker(ISayable sayable) {
		this.sayable = sayable;
	}
	
	public void speak() {
		sayable.say();
	}

}
