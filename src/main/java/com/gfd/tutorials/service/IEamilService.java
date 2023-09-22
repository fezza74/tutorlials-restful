package com.gfd.tutorials.service;

import java.util.List;
import com.gfd.tutorials.model.Email;

public interface IEamilService {
	Email saveEmail(Email email);
	Email findById(Integer id);
	List<Email> findAll();
	Email updateEmail(Email email, Integer id); 
	void deleteById(Integer id);
}
