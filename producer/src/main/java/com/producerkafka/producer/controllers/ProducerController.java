package com.producerkafka.producer.controllers;


import com.producerkafka.producer.presenter.MessagePresenter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RequestMapping(value = "/v1", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public interface ProducerController {
  @PostMapping("/send")
  ResponseEntity<?> send(@RequestBody List<MessagePresenter> presenter);

}
