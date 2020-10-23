package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Message;
import com.revature.models.Mood;
import com.revature.services.MService;

@RestController
@CrossOrigin(value="*", allowedHeaders="*")
@ResponseBody
public class MController {
	private MService mService;
	
	@Autowired
	public MController(MService ms) {
		super();
		mService = ms;
	}
	@PostMapping("/fillDB")
	public ResponseEntity<String> fillDB()
	{
		String[] moods = {"Tired", "Happy", "Sad", "Angry", "Disgusted", "Fearful", "Excited", 
				"Uncertain", "Bored", "Adoring", "Pouting", "Mischievous", "Sarcastic", "Rushed/Wired", "Musical"};
		
		String[] messages = {"My hovercraft is full of eels.", "I turned around for five minutes!", 
				"Put that thing back where it came from or so help me.", "Who’s a good boy?", "My dog ate my homework.",
				"It seemed like a good idea at the time.", "Where have you been?", "Do you wanna build a snowman?",
				"I tawt I taw a puddy tat!", "It’s turtles all the way down.", "Coffee is the lifeblood that drives the dreams of champions.",
				"Did you say thirty million or three trillion?", "Begin Operation: Upgraded Octo-Guacamole.", "Happy Rama-hana-kwanz-mas-tice.",
				"I don’t have enough caffeine for this."};	
		mService.saveMoods(moods);
		mService.saveMessages(messages);
		return ResponseEntity.accepted().body(mService.getMoods().toString());
	}
	@GetMapping("/mood")
	public ResponseEntity<String> getMood(){
		//use MService to retrieve a random mood from the database
		Optional<Mood> mo = mService.getMood();
		if(mo.isPresent())
			return ResponseEntity.accepted().body(mo.get().getName());
		else
			return ResponseEntity.notFound().build();
	}
	@GetMapping("/allmoods")
	public ResponseEntity<String> getMoods(){
	
		List<Mood> moods = mService.getMoods();
		return ResponseEntity.accepted().body(moods.toString());
	}
	
	@GetMapping("/message")
	public ResponseEntity<String> getMessage(){

		//use MService to retrieve a random message from the database
		Optional<Message> me = mService.getMessage();
		if(me.isPresent())
			return ResponseEntity.accepted().body(me.get().getText());
		else
			return ResponseEntity.notFound().build();
		}


}
