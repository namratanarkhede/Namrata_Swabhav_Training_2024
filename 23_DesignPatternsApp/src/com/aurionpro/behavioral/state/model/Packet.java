package com.aurionpro.behavioral.state.model;

public class Packet{
	private IPacketState packetState;

	public IPacketState getPacketState() {
		return packetState;
	}

	public void setPacketState(IPacketState packetState) {
		this.packetState = packetState;
	}

	public Packet(IPacketState packetState) {
		super();
		this.packetState = packetState;
	}
	
	 public void goToNextState() {
	    packetState.next(this);
	 }

	 public void goToPreviousState() {
	    packetState.previous(this);
	 }

	 public void printCurrentStatus() {
	    packetState.current(this);
	 }
}
