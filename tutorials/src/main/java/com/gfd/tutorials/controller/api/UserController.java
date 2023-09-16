package com.gfd.tutorials.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfd.tutorials.model.User;
import com.gfd.tutorials.service.UserService;

@RestController
@RequestMapping("/tutorials/api/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping
	public User saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.findById(id);
	}
}
