package com.aurionpro.behavioral.state.model;

public class Delivered implements IPacketState{
	@Override
	public void next(Packet packet) {
	    System.out.println("This is the final state. No next state available.");
	}

	@Override
	public void previous(Packet packet) {
	    packet.setPacketState(new Received());
	    System.out.println("Packet moved back to Received state.");
	}

	@Override
	public void current(Packet packet) {
	     System.out.println("Packet is currently in Delivered state.");
	}
}
