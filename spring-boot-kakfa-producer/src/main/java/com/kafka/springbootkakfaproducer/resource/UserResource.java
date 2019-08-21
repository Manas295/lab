package com.kafka.springbootkakfaproducer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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


	@PostMapping("/publish/{name}/{technology}")
	public String postAsString(@PathVariable("name") final String name,@PathVariable("technology") final String tech)
	{

		kafkaTemplate.send(TOPICFORSTRING, new User(name,tech).toString());

		return "Published successfully As String";
	}



	@PostMapping("/publishJson") public String
	postAsJson(@RequestBody User user) throws JsonProcessingException {
		ObjectMapper objMap = new ObjectMapper();

		kafkaTemplate.send(TOPICFORJSON,objMap.writeValueAsString(user));

		return "Json Published successfully"; }



}
