package org.example.producer.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProduceController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/1")
    public String produce1() {
        kafkaTemplate.send("topic1", "Hello World from topic 1");
        return "Produced topic 1";
    }

    @GetMapping("/2")
    public String produce2() {
        kafkaTemplate.send("topic2", "Hello World from topic 2");
        return "Produced topic 2";
    }
}
