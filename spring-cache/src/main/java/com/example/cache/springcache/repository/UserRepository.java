package com.example.cache.springcache.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.example.cache.springcache.model.User;

@Repository
public class UserRepository {

	List<User> users;

	public List<User> getUser() {
		sleep();
		System.out.println("Calling Repo first Time");
		users = Stream.of("ABC", "DEF", "MNO", "PQR").map(User::new).collect(Collectors.toList());
		return users;
	}

	public User getUserByName(String name) {
		sleep();
		return users.stream().filter(user -> user.getName().equals(name)).findFirst().orElse(null);
	}

	public void sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
