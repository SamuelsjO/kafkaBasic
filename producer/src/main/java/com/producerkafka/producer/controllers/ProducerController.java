package com.producerkafka.producer.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ProducerController {

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  @GetMapping("send")
  public ResponseEntity<?> send(){
    kafkaTemplate.send("topic-1", "Samuel do kafka: " + LocalDateTime.now());
    return ResponseEntity.ok().build();
  }
}
