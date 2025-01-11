package org.example.producer.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Dummy {
    String topic;
    int times;
}
