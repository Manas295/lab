package com.kafka.springbootkafkaconsumer.listener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.springbootkafkaconsumer.model.User;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka-topic2", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "kafka-Json", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }

}