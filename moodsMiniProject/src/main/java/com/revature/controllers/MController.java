package com.revature.controllers;

import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MController {
	
	@GetMapping("/mood")
	public ResponseEntity<String> getMood(){
		String[] moodStrings = {"Tired", "Happy", "Sad", "Angry", "Disgusted", "Fearful", "Excited", 
				"Uncertain", "Bored", "Adoring", "Pouting", "Mischievous", "Sarcastic", "Rushed/Wired", "Musical"};
		
		return ResponseEntity.accepted().body(moodStrings[new Random().nextInt(moodStrings.length)]);
	}
	
	@GetMapping("/message")
	public ResponseEntity<String> getMessage(){
		String[] messageStrings = {"My hovercraft is full of eels.", "I turned around for five minutes!", 
				"Put that thing back where it came from or so help me.", "Who’s a good boy?", "My dog ate my homework.",
				"It seemed like a good idea at the time.", "Where have you been?", "Do you wanna build a snowman?",
				"I tawt I taw a puddy tat!", "It’s turtles all the way down.", "Coffee is the lifeblood that drives the dreams of champions.",
				"Did you say thirty million or three trillion?", "Begin Operation: Upgraded Octo-Guacamole.", "Happy Rama-hana-kwanz-mas-tice.",
				"I don’t have enough caffeine for this."};	
		
		return ResponseEntity.accepted().body(messageStrings[new Random().nextInt(messageStrings.length)]);

		}


}
