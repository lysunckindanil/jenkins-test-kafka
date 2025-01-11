package org.example.producer.controllers;

import lombok.RequiredArgsConstructor;
import org.example.producer.dto.Dummy;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class ProduceController {
    private final KafkaTemplate<String, Dummy> kafkaTemplate;

    @GetMapping("/{topic}/{times}")
    public String produce1(@PathVariable String topic, @PathVariable int times, Model model) {
        List<Dummy> dummyList = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            Dummy dummy = Dummy.builder().topic(topic).times(i).build();
            dummyList.add(dummy);
            kafkaTemplate.send(topic, dummy);
        }
        model.addAttribute("dummyList", dummyList);
        return "response";
    }
}
