package com.gfd.tutorials.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gfd.tutorials.model.Email;
import com.gfd.tutorials.repository.IEmailRepository;
import com.gfd.tutorials.repository.IUserRepository;


@Service
public class EmailService implements IEamilService {
	@Autowired
	IEmailRepository emailRepository;
	@Autowired
	IUserRepository userRepository;
	
	@Override
	public Email saveEmail(Email email) {
		email.setUser(userRepository.findByUserCode(email.getUser().getUserCode()));
		System.out.println(email.toString());
		return emailRepository.save(email);
	}

	@Override
	public Email findById(Integer id) {
		return emailRepository.findById(id).orElse(null);
	}

	@Override
	public List<Email> findAll() {
		return (List<Email>) emailRepository.findAll();
	}

	@Override
	public Email updateEmail(Email email, Integer id) {
		return emailRepository.save(email);
	}
	
	@Override
	public void deleteById(Integer id) {
		emailRepository.deleteById(id);
	}

}
