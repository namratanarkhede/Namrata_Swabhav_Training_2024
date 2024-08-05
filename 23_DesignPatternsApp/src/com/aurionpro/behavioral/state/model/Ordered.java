package com.aurionpro.behavioral.state.model;

public class Ordered implements IPacketState{
	 @Override
	 public void next(Packet packet) {
	    packet.setPacketState(new Received());
	    System.out.println("Packet moved to Received state.");
	 }

	 @Override
	 public void previous(Packet packet) {
	    System.out.println("This is the initial state. No previous state available.");
	 }

	 @Override
	 public void current(Packet packet) {
	    System.out.println("Packet is currently in Ordered state.");
	 }
	

}
