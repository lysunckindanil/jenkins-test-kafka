package org.example.consumer.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {
    @KafkaListener(topics = "topic1", groupId = "foo")
    public void consume1(String message) {
        log.info("Consumed message: {}", message);
    }

    @KafkaListener(topics = "topic2", groupId = "foo")
    public void consume2(String message) {
        log.info("Consumed message: {}", message);
    }
}
