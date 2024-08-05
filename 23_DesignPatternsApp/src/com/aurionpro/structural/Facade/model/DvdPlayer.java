package com.aurionpro.structural.Facade.model;

public class DvdPlayer implements IStarter{
	private String movie;
	

	public DvdPlayer(String movie) {
		super();
		this.movie = movie;
	}

	public String getMovie() {
		return movie;
	}

	@Override
	public void on() {
		System.out.println("DVD Is started");
	}
	
	public void setMovie(String movie) {
		this.movie = movie;
		System.out.println("The Movie Name is : "+ this.movie);
		
		
	}
	
}
