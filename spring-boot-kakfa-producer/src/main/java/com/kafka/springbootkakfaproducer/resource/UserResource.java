package com.kafka.springbootkakfaproducer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.springbootkakfaproducer.model.User;

@RestController
@RequestMapping("/kafka")
public class UserResource {

	@Autowired(required=true)
	private KafkaTemplate kafkaTemplate;
	
	/*
	 * @Autowired(required=true) private KafkaTemplate<String,User>
	 * kafkaJsonTemplate;
	 */	
	@Value(value = "${message.topic.name.json}")
	private String TOPICFORJSON;

	@Value(value = "${message.topic.name.string}")
	private String TOPICFORSTRING;

	
	@GetMapping("/publish/{name}/{technology}/{salary}")
	public String postAsString(@PathVariable("name") final String name,@PathVariable("technology") final String tech,@PathVariable("salary") final String salary)
	{
		
		kafkaTemplate.send(TOPICFORSTRING, new User(name,tech,Long.valueOf(salary)).toString());
		
		return "Published successfully As String";
	}
	
	
	/*
	 * @GetMapping("/publishJson/{name}/{technology}/{salary}") public String
	 * postAsJson(@PathVariable("name") final String
	 * name,@PathVariable("technology") final String tech,@PathVariable("salary")
	 * final String salary) {
	 * 
	 * kafkaJsonTemplate.send(TOPICFORJSON, new
	 * User(name,tech,Long.valueOf(salary)));
	 * 
	 * return "Json Published successfully"; }
	 */	
	
	
}
