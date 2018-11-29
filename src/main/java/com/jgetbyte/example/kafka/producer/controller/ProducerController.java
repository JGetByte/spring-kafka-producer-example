package com.jgetbyte.example.kafka.producer.controller;

import com.jgetbyte.example.kafka.producer.service.ProducerService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping(value = "/send-message")
    public void sendMessage(@RequestBody Map<String,String> body) {
        final String msg = body.get("message");
        producerService.send(msg);
    }
}
