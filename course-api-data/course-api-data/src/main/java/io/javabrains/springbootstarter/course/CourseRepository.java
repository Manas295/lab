package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface  CourseRepository extends CrudRepository<Course,String> {//Here two paramters are generic typ i.e 1st : Entity class , 2nd:Type of  Primary key  in entity class
	// Above interface i.e Crudrepository is JPA interface having basic CRUD operations method which we can extend simply
	
	

	public List<Course> findByTopicId(String topicId);
//Here naming If we write only findByTopic then its a object we need to pass in method params but its not possible so we
	// mention findByTopicId(String topicId)--> "Topic" means the Topic property on the course & "Id" is the property of topic on course which we are looking for 
	
}
