package com.gfd.tutorials.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gfd.tutorials.model.Url;
import com.gfd.tutorials.model.User;
import com.gfd.tutorials.repository.IUrlRepository;
import com.gfd.tutorials.repository.IUserRepository;


@Service
public class UrlService implements IUrlService {
	@Autowired
	IUrlRepository urlRepository;
	@Autowired
	IUserRepository userRepository;
	
	@Override
	public Url saveUrl(Url url) {
		User user = userRepository.findByUserCode(url.getUser().getUserCode());
		url.setUser(user);
		return urlRepository.save(url);
	}

	@Override
	public Url findById(Integer id) {
		return urlRepository.findById(id).orElse(null);
	}

	@Override
	public List<Url> findAll() {
		return (List<Url>) urlRepository.findAll();
	}

	@Override
	public Url updateUrl(Url url, Integer id) {
		return urlRepository.save(url);
	}
	
	@Override
	public void deleteById(Integer id) {
		urlRepository.deleteById(id);
	}

}
