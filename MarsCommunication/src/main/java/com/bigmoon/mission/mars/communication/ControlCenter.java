package com.bigmoon.mission.mars.communication;

public class ControlCenter {
	
	public void sendMessage(String message) {
		System.out.println("ControlCenter::sendMessage:: message received");
	}
	
	public String retreiveMessage() {
		return "ControlCenter::retreiveMessage:: message sent";
	}
}
