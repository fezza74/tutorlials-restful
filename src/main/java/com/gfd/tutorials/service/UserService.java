package com.gfd.tutorials.service;

import java.util.List;

import com.gfd.tutorials.exception.ResourceBadRequestException;
import com.gfd.tutorials.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gfd.tutorials.model.User;
import com.gfd.tutorials.repository.IUserRepository;


@Service
public class UserService implements IUserService {
	@Autowired
	IUserRepository iUserRepository;
	
	@Override
	public User saveUser(User user) {
		try {
			return iUserRepository.save(user);
		} catch (RuntimeException ex) {
			throw new ResourceBadRequestException("Utente duplicato");
		}
	}

	@Override
	public User findById(Integer id) {
		return iUserRepository.findById(id).
				orElseThrow(() -> new ResourceNotFoundException("Utente con id " + id + " non presente"));
	}
	
	@Override
	public User findByUserCode(String userCode) {
		return iUserRepository.findByUserCode(userCode);
	}

	@Override
	public List<User> findAll() {
			return (List<User>) iUserRepository.findAll();
	}

	@Override
	public User updateUser(User user, Integer id) {
		try {
			return iUserRepository.save(user);
		} catch (RuntimeException ex) {
			throw new ResourceBadRequestException("Dati inseriti errati");
		}
	}
	
	@Override
	public void deleteById(Integer id) {
		try {
			iUserRepository.deleteById(id);
		} catch (RuntimeException ex){
			throw new ResourceBadRequestException("Id non valido");
		}
	}

}
