package com.boot.app.SpringBootJpaPostgresExample.service;


import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString

@NoArgsConstructor
@Document
public class Customer {
	@Id
	private Long id;
	@Field
	private String firstName;
	@Field
	private String lastName;
	public Customer(Long id,String firstname,String lastname) {
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
