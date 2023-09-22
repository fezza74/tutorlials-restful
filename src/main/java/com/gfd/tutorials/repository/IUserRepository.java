package com.gfd.tutorials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.gfd.tutorials.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {
	User findByUserCode(String userCode);
}
