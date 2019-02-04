package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface  TopicRepository extends CrudRepository<Topic,String> {
	/*Here two paramters are generic typ i.e 1st : Entity class , 2nd:Type of  Primary key  in entity class
	 Above interface i.e Crudrepository is JPA interface having basic CRUD operations method which we can extend simply*/

}
