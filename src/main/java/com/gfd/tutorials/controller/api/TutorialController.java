package com.gfd.tutorials.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfd.tutorials.model.Tutorial;
import com.gfd.tutorials.service.TutorialService;

@RestController
@RequestMapping("/tutorials/api/tutorials")
public class TutorialController {
	@Autowired
	TutorialService tutorialService;
	
	@PostMapping
	public Tutorial saveTutorial(@RequestBody Tutorial tutorial){
		return tutorialService.saveTutorial(tutorial);
	}
	
	@GetMapping("/{id}")
	public Tutorial getTutorial(@PathVariable Integer id) {
		return tutorialService.findById(id);
	}
	
	@GetMapping
	public List<Tutorial> getAllTutorials(){
		return tutorialService.findAll();
	}
}
