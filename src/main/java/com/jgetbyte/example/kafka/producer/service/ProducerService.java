package com.jgetbyte.example.kafka.producer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProducerService {
    
    @Autowired
    private KafkaTemplate kafkaTemplate;
    
    public void send(String msg) {
        log.info("topic: piyawut.chi | sending msg: [{}]", msg);
        kafkaTemplate.send("piyawut.chi", msg);
    }
}
