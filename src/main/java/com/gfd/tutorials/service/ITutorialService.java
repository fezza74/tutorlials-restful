package com.gfd.tutorials.service;

import java.util.List;
import com.gfd.tutorials.model.Tutorial;

public interface ITutorialService {
	Tutorial saveTutorial(Tutorial tutorial);
	Tutorial findById(Integer id);
	List<Tutorial> findAll();
	Tutorial updateTutorial(Tutorial tutorial, Integer id); 
	void deleteById(Integer id);
}
