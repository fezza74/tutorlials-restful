package com.gfd.tutorials.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gfd.tutorials.model.Phone;
import com.gfd.tutorials.repository.IPhoneRepository;
import com.gfd.tutorials.repository.IUserRepository;


@Service
public class PhoneService implements IPhoneService {
	@Autowired
	IPhoneRepository phoneRepository;
	@Autowired
	IUserRepository iUserRepository;
	
	@Override
	public Phone savePhone(Phone phone) {
		phone.setUser(iUserRepository.findByUserCode(phone.getUser().getUserCode()));
		return phoneRepository.save(phone);
	}

	@Override
	public Phone findById(Integer id) {
		return phoneRepository.findById(id).orElse(null);
	}

	@Override
	public List<Phone> findAll() {
		return (List<Phone>) phoneRepository.findAll();
	}

	@Override
	public Phone updatePhone(Phone phone, Integer id) {
		return phoneRepository.save(phone);
	}
	
	@Override
	public void deleteById(Integer id) {
		phoneRepository.deleteById(id);
	}

}
