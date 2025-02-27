package com.fms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.model.User;

public interface UserRepository  extends JpaRepository<User, Integer> {

	
	public User findByEmail(String email);
}
