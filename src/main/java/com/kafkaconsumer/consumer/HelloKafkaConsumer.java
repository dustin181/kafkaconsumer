package com.kafkaconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloKafkaConsumer {

    @KafkaListener(topics = "t_hello")
    public void consume(String message){
        System.out.println(message);
    }
}
