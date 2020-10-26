package com.revature.services;

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
		return moDAO.findById(new Random().nextInt((moDAO.findAll().size()) - 1));
	}
	
	public Optional<Message> getMessage() {
		return meDAO.findById(new Random().nextInt((meDAO.findAll().size()) - 1));
	}

	public void saveMoods(String[] moodStrings) {
		Mood mo;
		for(int i = 0; i < moodStrings.length; i++) {
			mo = new Mood();
			mo.setName(moodStrings[i]);
			moDAO.save(mo);
		}
		
	}
	public void saveMessages(String[] messages) {
		Message me;
		for(int i = 0; i < messages.length; i++) {
			me = new Message();
			me.setText(messages[i]);
			meDAO.save(me);
		}
	}
	
	public List<Mood> getMoods()
	{
		return moDAO.findAll();
	}
}
