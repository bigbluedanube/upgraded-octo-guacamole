package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Message;

public interface IMessageDAO extends JpaRepository<Message, Integer> {

}
