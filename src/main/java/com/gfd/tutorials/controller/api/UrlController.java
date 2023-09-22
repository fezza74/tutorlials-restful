package com.gfd.tutorials.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfd.tutorials.model.Url;
import com.gfd.tutorials.service.UrlService;

@RestController
@RequestMapping("/tutorials/api/urls")
public class UrlController {
	@Autowired
	UrlService urlService;
	
	@PostMapping
	public Url saveUrl(@RequestBody Url url){
		return urlService.saveUrl(url);
	}
	
	@GetMapping("/{id}")
	public Url getUrl(@PathVariable Integer id) {
		return urlService.findById(id);
	}
	
	@GetMapping
	public List<Url> getAllUrls(){
		return urlService.findAll();
	}
}
