package com.aurionpro.behavioral.state.test;

import com.aurionpro.behavioral.state.model.Ordered;
import com.aurionpro.behavioral.state.model.Packet;

public class PacketTest {
	public static void main(String[] args) {
		Packet packet = new Packet(new Ordered());
		
		packet.printCurrentStatus();
		
		packet.goToNextState();
		packet.printCurrentStatus();
		
		packet.goToNextState();
		packet.printCurrentStatus();
		
		packet.goToPreviousState();
		packet.printCurrentStatus();
	}

}
