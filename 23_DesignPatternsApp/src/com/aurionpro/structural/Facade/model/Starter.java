package com.aurionpro.structural.Facade.model;

public class Starter {
	
	public void startDVD() {
		IStarter dvdPlayer = new DvdPlayer("Marvel");
		((DvdPlayer) dvdPlayer).getMovie();
		dvdPlayer.on();
		
	}
	public void startProjector() {
		IStarter projector = new Projector();
		projector.on();
	}

	public void startSoundSystem() {
		IStarter soundSystem = new SoundSystem(200);	
		((SoundSystem) soundSystem).getVolumeLevel();
		soundSystem.on();
	}
}
