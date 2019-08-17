package com.example.cache.springcache.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.Data;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = 1751951927211380654L;
	private String id;
	private String name;

	public User(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}
}