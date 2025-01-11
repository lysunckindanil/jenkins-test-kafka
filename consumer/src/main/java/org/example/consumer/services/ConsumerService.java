package org.example.consumer.services;

import lombok.extern.slf4j.Slf4j;
import org.example.consumer.dto.Dummy;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {

    @KafkaListener(topics = "topic1", groupId = "foo1")
    public void consume1(Dummy message) {
        log.info("foo1 consumed message: {}", message);
    }

    @KafkaListener(topics = "topic2", groupId = "foo1")
    public void consume2(Dummy message) {
        log.info("foo2 consumed message: {}", message);
    }
}
