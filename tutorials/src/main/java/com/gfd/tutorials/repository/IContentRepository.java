package com.gfd.tutorials.repository;

import org.springframework.data.repository.CrudRepository;

import com.gfd.tutorials.model.Content;

public interface IContentRepository extends CrudRepository<Content, Integer> {
}
