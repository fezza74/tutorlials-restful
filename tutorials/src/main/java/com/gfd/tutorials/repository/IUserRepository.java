package com.gfd.tutorials.repository;

import org.springframework.data.repository.CrudRepository;
import com.gfd.tutorials.model.User;

public interface IUserRepository extends CrudRepository<User, Integer> {
	User findByUserCode(String userCode);
}
