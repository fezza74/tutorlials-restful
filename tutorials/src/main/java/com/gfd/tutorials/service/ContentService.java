package com.gfd.tutorials.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gfd.tutorials.model.Content;
import com.gfd.tutorials.repository.IContentRepository;
import com.gfd.tutorials.repository.ITutorialRepository;


@Service
public class ContentService implements IContentService {
	@Autowired
	IContentRepository contentRepository;
	@Autowired
	ITutorialRepository tutorialRepository;
	
	@Override
	public Content saveContent(Content content) {
		return contentRepository.save(content);
	}

	@Override
	public Content findById(Integer id) {
		return contentRepository.findById(id).orElse(null);
	}

	@Override
	public List<Content> findAll() {
		return (List<Content>) contentRepository.findAll();
	}

	@Override
	public Content updateContent(Content content, Integer id) {
		return saveContent(content);
	}
	
	@Override
	public void deleteById(Integer id) {
		contentRepository.deleteById(id);
	}

}
