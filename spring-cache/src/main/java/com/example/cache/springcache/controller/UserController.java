package com.example.cache.springcache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cache.springcache.model.User;
import com.example.cache.springcache.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public List<User> getUser() {
		return userService.getUser();
	}
	
	@PostMapping("/users")
	public void user(@RequestBody User user) {
		System.out.println(user.getId()+"::"+user.getName());
	}

	@RequestMapping("/users/{name}")
	public User getUserByName(@PathVariable String name) {
		return userService.getUserByName(name);
	}
}
