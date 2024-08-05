package com.aurionpro.dipviolation.model;

public class DbLogger implements ILogger{

	  @Override
	  public void log(String message) {
	      System.out.println("Logged to Database: " + message);
	  }
	
}
