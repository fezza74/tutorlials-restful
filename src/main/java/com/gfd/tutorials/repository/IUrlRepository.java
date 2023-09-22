package com.gfd.tutorials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.gfd.tutorials.model.Url;

public interface IUrlRepository extends JpaRepository<Url, Integer> {
	Url findByUrlPath(String path);
}
