package com.bigmoon.mission.mars.exploration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Message {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String showIndex() {
        return "Hello world";
    }
    
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    @ResponseBody
    public String greeting() {
        return "Hallo 'Hello world!!!'";
    } 
	
	/*	
	@RequestMapping("/explorationTest")
	@ResponseBody
	String test() {
		return "Exploration Test111";
	}
	
	@RequestMapping("/itinerary")
	@ResponseBody
	String itinerary() {
		return "{}";
	}	
	
	*/
}
