package com.aurionpro.behavioral.command.model;

public class FileInvoker {

public Command command;
	
	public FileInvoker(Command c){
		this.command=c;
	}
	
	public void execute(){
		this.command.execute();
	}
}
