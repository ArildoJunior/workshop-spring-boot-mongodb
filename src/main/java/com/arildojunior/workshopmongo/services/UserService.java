package com.arildojunior.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arildojunior.workshopmongo.domain.User;
import com.arildojunior.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}