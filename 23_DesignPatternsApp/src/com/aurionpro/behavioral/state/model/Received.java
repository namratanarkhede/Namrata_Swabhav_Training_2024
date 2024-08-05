package com.aurionpro.behavioral.state.model;

public class Received implements IPacketState{

	@Override
	 public void next(Packet packet) {
	    packet.setPacketState(new Delivered());
	    System.out.println("Packet moved to Delivered state.");
	 }

	 @Override
	 public void previous(Packet packet) {
		 packet.setPacketState(new Ordered());
	     System.out.println("Packet moved back to Ordered state.");
	 }

	 @Override
	 public void current(Packet packet) {
	    System.out.println("Packet is currently in Received state.");
	 }
	

}
