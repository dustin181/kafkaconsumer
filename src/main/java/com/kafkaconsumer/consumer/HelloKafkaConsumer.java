package com.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloKafkaConsumer {

    @KafkaListener(topics = "t_hello")
    public void consume(String message){
        System.out.println(message);
    }

    @KafkaListener(topics = "t_fixedrate")
    public void consume2(String message){
        System.out.println(message);
    }
}
