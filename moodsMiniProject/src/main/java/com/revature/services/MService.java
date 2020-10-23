package com.revature.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Message;
import com.revature.models.Mood;
import com.revature.repositories.IMessageDAO;
import com.revature.repositories.IMoodDAO;

@Service
public class MService {
	private IMessageDAO meDAO;
	private IMoodDAO moDAO;
	
	@Autowired
	public MService(IMessageDAO meDAO, IMoodDAO moDAO) {
		super();
		this.meDAO = meDAO;
		this.moDAO = moDAO;
	}
	
	public Optional<Mood> getMood() {
		return moDAO.findById(new Random().nextInt(moDAO.findAll().size()));
	}
	
	public Optional<Message> getMessage() {
		return meDAO.findById(new Random().nextInt(meDAO.findAll().size()));
	}

	public void saveMoods(String[] moodStrings) {
		List<Mood> moList = new ArrayList<Mood>();
		Mood mo = new Mood();
		for(int i = 0; i < moodStrings.length; i++) {
			mo.setId(i);
			mo.setName(moodStrings[i]);
			moList.add(mo);
		}
		moDAO.saveAll(moList);
		
	}
	public void saveMessages(String[] messages) {
		List<Message> meList = new ArrayList<Message>();
		Message me = new Message();
		for(int i = 0; i < messages.length; i++) {
			me.setId(i);
			me.setText(messages[i]);
			meList.add(me);
		}
		meDAO.saveAll(meList);
	}
}
