package com.example.cache.springcache.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.cache.springcache.model.User;
import com.example.cache.springcache.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	@Cacheable("userCache")
	public List<User> getUser() {
		return userRepo.getUser();
	}

	@Cacheable(value = "userCache", keyGenerator = "userKeyGenerator", condition = "#name.startsWith('D')")
	public User getUserByName(String name) {
		return userRepo.getUserByName(name);
	}

}
