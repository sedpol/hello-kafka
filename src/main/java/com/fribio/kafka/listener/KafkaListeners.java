package com.fribio.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener (topics = "hello_kafka", groupId = "hello_kafka_1")
    void listener(String message) {
        System.out.println("Message received: " + message);
    }

}
