package com.gfd.tutorials.service;

import java.util.List;
import com.gfd.tutorials.model.Phone;

public interface IPhoneService {
	Phone savePhone(Phone phone);
	Phone findById(Integer id);
	List<Phone> findAll();
	Phone updatePhone(Phone phone, Integer id); 
	void deleteById(Integer id);
}
