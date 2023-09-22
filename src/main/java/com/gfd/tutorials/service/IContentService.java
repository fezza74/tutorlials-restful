package com.gfd.tutorials.service;

import java.util.List;
import com.gfd.tutorials.model.Content;

public interface IContentService {
	Content saveContent(Content content);
	Content findById(Integer id);
	List<Content> findAll();
	Content updateContent(Content content, Integer id); 
	void deleteById(Integer id);
}
