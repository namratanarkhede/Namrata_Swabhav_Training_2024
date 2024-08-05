package com.aurionpro.dipviolation.model;

public class FileLogger implements ILogger{

	@Override
	public void log(String message) {
        System.out.println("Logged to File: " + message);
		
	}

	

}
