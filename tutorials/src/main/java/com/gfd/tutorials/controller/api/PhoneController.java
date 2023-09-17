package com.gfd.tutorials.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfd.tutorials.model.Phone;
import com.gfd.tutorials.service.PhoneService;

@RestController
@RequestMapping("/tutorials/api/phones")
public class PhoneController {
	@Autowired
	PhoneService phoneService;
	
	@PostMapping
	public Phone savePhone(@RequestBody Phone phone){
		return phoneService.savePhone(phone);
	}
	
	@GetMapping("/{id}")
	public Phone getPhone(@PathVariable Integer id) {
		return phoneService.findById(id);
	}
}
