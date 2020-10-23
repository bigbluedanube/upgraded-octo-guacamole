package com.revature.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.revature.models.Mood;

public class MoodDAO implements IMoodDAO {

	@Override
	public List<Mood> findAll() {
		return null;
	}

	@Override
	public List<Mood> findAll(Sort sort) {
		return null;
	}

	@Override
	public List<Mood> findAllById(Iterable<Integer> ids) {
		return null;
	}

	@Override
	public <S extends Mood> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public void flush() {

	}

	@Override
	public <S extends Mood> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Mood> entities) {

	}

	@Override
	public void deleteAllInBatch() {

	}

	@Override
	public Mood getOne(Integer id) {
		return null;
	}

	@Override
	public <S extends Mood> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Mood> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public Page<Mood> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Mood> S save(S entity) {
		return null;
	}

	@Override
	public Optional<Mood> findById(Integer id) {
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		return false;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Integer id) {

	}

	@Override
	public void delete(Mood entity) {

	}

	@Override
	public void deleteAll(Iterable<? extends Mood> entities) {

	}

	@Override
	public void deleteAll() {

	}

	@Override
	public <S extends Mood> Optional<S> findOne(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Mood> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Mood> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends Mood> boolean exists(Example<S> example) {
		return false;
	}

}
