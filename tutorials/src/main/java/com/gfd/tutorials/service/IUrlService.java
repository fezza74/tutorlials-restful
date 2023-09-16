package com.gfd.tutorials.service;

import java.util.List;
import com.gfd.tutorials.model.Url;

public interface IUrlService {
	Url saveUrl(Url url);
	Url findById(Integer id);
	List<Url> findAll();
	Url updateUrl(Url url, Integer id); 
	void deleteById(Integer id);
}
