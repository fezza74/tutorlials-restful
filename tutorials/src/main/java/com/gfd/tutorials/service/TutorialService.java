package com.gfd.tutorials.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gfd.tutorials.model.Tutorial;
import com.gfd.tutorials.model.User;
import com.gfd.tutorials.repository.ITutorialRepository;
import com.gfd.tutorials.repository.IUserRepository;


@Service
public class TutorialService implements ITutorialService {
	@Autowired
	ITutorialRepository tutorilaRepository;
	@Autowired
	IUserRepository userRepository;
	
	@Override
	public Tutorial saveTutorial(Tutorial tutorial) {
		User user = userRepository.findByUserCode(tutorial.getUser().getUserCode());
		tutorial.setUser(user);
		return tutorilaRepository.save(tutorial);
	}

	@Override
	public Tutorial findById(Integer id) {
		return tutorilaRepository.findById(id).orElse(null);
	}
	
	@Override
	public Tutorial findByTitle(String title) {
		return tutorilaRepository.findByTitle(title);
	}

	@Override
	public List<Tutorial> findAll() {
		return (List<Tutorial>) tutorilaRepository.findAll();
	}

	@Override
	public Tutorial updateTutorial(Tutorial tutorial, Integer id) {
		return tutorilaRepository.save(tutorial);
	}
	
	@Override
	public void deleteById(Integer id) {
		tutorilaRepository.deleteById(id);
	}

}
