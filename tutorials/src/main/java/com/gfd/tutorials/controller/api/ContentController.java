package com.gfd.tutorials.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfd.tutorials.model.Content;
import com.gfd.tutorials.service.ContentService;

@RestController
@RequestMapping("/tutorials/api/contents")
public class ContentController {
	@Autowired
	ContentService contentService;
	
	@PostMapping("/new")
	public Content saveContent(@RequestBody Content content){
		return contentService.saveContent(content);
	}
	
	@GetMapping("/{id}")
	public Content getContent(@PathVariable Integer id) {
		return contentService.findById(id);
	}
	
	@GetMapping("/all")
	public List<Content> getAllContents(){
		return contentService.findAll();
	}
}
