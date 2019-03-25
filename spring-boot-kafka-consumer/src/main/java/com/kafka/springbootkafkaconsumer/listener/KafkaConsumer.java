package com.kafka.springbootkafkaconsumer.listener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.kafka.springbootkakfaproducer.model.User;

@Service
public class KafkaConsumer {

    /*@KafkaListener(topics = "kafka-topic2", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "kafka-Json", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
*/
	
	
	  @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
	    public void consume(String message) {
	        System.out.println("Consumed message: " + message);
	    }


	    @KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
	            containerFactory = "userKafkaListenerFactory")
	    public void consumeJson(User user) {
	    	Gson gson = new Gson();
	        System.out.println("Consumed JSON Message: " + gson.toJson(user));
	    }
}