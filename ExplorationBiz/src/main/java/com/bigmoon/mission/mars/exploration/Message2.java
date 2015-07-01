package com.bigmoon.mission.mars.exploration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigmoon.mission.mars.communication.ControlCenter;

@Controller
public class Message2 {
	
	@RequestMapping("/retrieveMessage")
	@ResponseBody
	String retrieveMessage() {
		ControlCenter cc = new ControlCenter();
		return cc.retreiveMessage();
	}
	
	@RequestMapping("/explorationTest")
	@ResponseBody
	String test() {
		return "Exploration Test";
	}
	
	@RequestMapping("/itinerary")
	@ResponseBody
	String itinerary() {
		System.out.println("itinerary");
		return "12345";
	}
}
