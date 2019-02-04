package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//The Annotation tell JPA to create a table in Database with name "TOPIC"
public class Topic {

	//Member variable will act as a columns names for table
	@Id //String id will act as a primary key in table
	private String id;
	private String name;
	private String description;
	
	public Topic() {
	}

	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
