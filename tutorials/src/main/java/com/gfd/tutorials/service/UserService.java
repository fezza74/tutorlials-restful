package com.gfd.tutorials.service;

import java.util.List;
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
		return iUserRepository.save(user);
	}

	@Override
	public User findById(Integer id) {
		return iUserRepository.findById(id).orElse(null);
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
		return iUserRepository.save(user);
	}
	
	@Override
	public void deleteById(Integer id) {
		iUserRepository.deleteById(id);
	}

}
