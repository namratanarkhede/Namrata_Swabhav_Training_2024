package com.aurionpro.behavioral.command.model;

public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	
	public CloseFileCommand(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	

}
