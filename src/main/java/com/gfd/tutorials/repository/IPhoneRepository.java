package com.gfd.tutorials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.gfd.tutorials.model.Phone;


public interface IPhoneRepository extends JpaRepository<Phone, Integer> {
}
