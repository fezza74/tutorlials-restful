package com.gfd.tutorials.service;

import java.util.List;
import com.gfd.tutorials.model.User;

public interface IUserService {
	User saveUser(User user);
	User findById(Integer id);
	List<User> findAll();
	User updateUser(User user, Integer id); 
	void deleteById(Integer id);
}
