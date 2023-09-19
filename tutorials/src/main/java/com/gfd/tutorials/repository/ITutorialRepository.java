package com.gfd.tutorials.repository;

import org.springframework.data.repository.CrudRepository;

import com.gfd.tutorials.model.Tutorial;

public interface ITutorialRepository extends CrudRepository<Tutorial, Integer> {
}
