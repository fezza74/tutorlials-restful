package com.gfd.tutorials.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gfd.tutorials.model.Url;
import com.gfd.tutorials.repository.ITutorialRepository;
import com.gfd.tutorials.repository.IUrlRepository;
import com.gfd.tutorials.repository.IUserRepository;


@Service
public class UrlService implements IUrlService {
	@Autowired
	IUrlRepository urlRepository;
	@Autowired
	IUserRepository userRepository;
	@Autowired
	ITutorialRepository tutorialRepository;
	
	@Override
	public Url saveUrl(Url url) {
		return urlRepository.save(url);
	}

	@Override
	public Url findById(Integer id) {
		return urlRepository.findById(id).orElse(null);
	}
	
	@Override
	public Url findByUrlPath(String path) {
		return urlRepository.findByUrlPath(path);
	}
	
	@Override
	public List<Url> findAll() {
		return (List<Url>) urlRepository.findAll();
	}

	@Override
	public Url updateUrl(Url url, Integer id) {
		return saveUrl(url);
	}
	
	@Override
	public void deleteById(Integer id) {
		urlRepository.deleteById(id);
	}

}
