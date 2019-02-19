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
	private KafkaTemplate<String,String> kafkaTemplate;
	
	
	  @Autowired(required=true) private KafkaTemplate<String,User>
	  kafkaJsonTemplate;
	 	
	@Value(value = "${message.topic.name.json}")
	private String TOPICFORJSON;

	@Value(value = "${message.topic.name.string}")
	private String TOPICFORSTRING;

	
	@GetMapping("/publish/{name}/{technology}")
	public String postAsString(@PathVariable("name") final String name,@PathVariable("technology") final String tech)
	{
		
		kafkaTemplate.send(TOPICFORSTRING, new User(name,tech).toString());
		
		return "Published successfully As String";
	}
	
	
	
	  @GetMapping("/publishJson/{name}/{field}") public String
	  postAsJson(@PathVariable("name") final String
	  name,@PathVariable("field") final String tech) {
	  kafkaJsonTemplate.send(TOPICFORJSON, new
	  User(name,tech));
	  
	  return "Json Published successfully"; }
	 	
	
	
}
