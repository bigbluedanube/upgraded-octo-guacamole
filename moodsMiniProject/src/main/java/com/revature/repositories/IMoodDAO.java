package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Mood;

public interface IMoodDAO extends JpaRepository<Mood, Integer> {

}
