package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.models.Message;
import com.revature.models.Mood;

@SpringBootApplication
public class MoodsMiniProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MoodsMiniProjectApplication.class, args);
		
		//hard-coded moods and messages
		String[] moodStrings = {"Tired", "Happy", "Sad", "Angry", "Disgusted", "Fearful", "Excited", 
				"Uncertain", "Bored", "Adoring", "Pouting", "Mischievous", "Sarcastic", "Rushed/Wired", "Musical"};
		String[] messageStrings = {"My hovercraft is full of eels.", "I turned around for five minutes!", 
				"Put that thing back where it came from or so help me.", "Who’s a good boy?", "My dog ate my homework.",
				"It seemed like a good idea at the time.", "Where have you been?", "Do you wanna build a snowman?",
				"I tawt I taw a puddy tat!", "It’s turtles all the way down.", "Coffee is the lifeblood that drives the dreams of champions.",
				"Did you say thirty million or three trillion?", "Begin Operation: Upgraded Octo-Guacamole.", "Happy Rama-hana-kwanz-mas-tice.",
				"I don’t have enough caffeine for this."};
		
		List<Mood> moods = new ArrayList<Mood>();
		List<Message> messages = new ArrayList<Message>();
		Mood mo;
		Message me;
		
		for(int i = 1; i <= moodStrings.length; i++) {
			mo = new Mood(i, moodStrings[i-1]);
			moods.add(mo);
		}
		for(int i = 1; i <= messageStrings.length; i++) {
			me = new Message(i, messageStrings[i-1]);
			messages.add(me);
		}
		
		for(int i = 0; i < 3; i++)
		{
			mo = moods.get(new Random().nextInt(moods.size()));
			me = messages.get(new Random().nextInt(messages.size()));
			System.out.println("Mood: " + mo.getName());
			System.out.println("Message: " + me.getText());
			System.out.println();
		}
	}

}
