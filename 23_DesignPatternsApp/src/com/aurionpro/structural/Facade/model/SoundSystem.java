package com.aurionpro.structural.Facade.model;

public class SoundSystem implements IStarter{

	private int volumeLevel;
	
	
	
	public SoundSystem(int volumeLevel) {
		super();
		this.volumeLevel = volumeLevel;
	}


	public int getVolumeLevel() {
		return volumeLevel;
	}


	@Override
	public void on() {
		System.out.println("SoundSystem is on");
	}
	
	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
		System.out.println("The Volume Level is : "+ this.volumeLevel);
		
	}

}
