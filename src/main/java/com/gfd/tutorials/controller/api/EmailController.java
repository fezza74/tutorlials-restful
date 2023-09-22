package com.gfd.tutorials.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfd.tutorials.model.Email;
import com.gfd.tutorials.service.EmailService;

@RestController
@RequestMapping("/tutorials/api/emails")
public class EmailController {
	@Autowired
	EmailService emailService;
	
	@PostMapping
	public Email saveEmail(@RequestBody Email email){
		return emailService.saveEmail(email);
	}
	
	@GetMapping("/{id}")
	public Email getEmail(@PathVariable Integer id) {
		return emailService.findById(id);
	}
	
	@GetMapping
	public List<Email> getAllEmails(){
		return emailService.findAll();
	}
}
