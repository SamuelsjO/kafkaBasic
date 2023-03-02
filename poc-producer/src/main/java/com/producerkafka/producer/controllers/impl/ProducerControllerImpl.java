package com.producerkafka.producer.controllers.impl;

import com.producerkafka.producer.controllers.ProducerController;
import com.producerkafka.producer.presenter.MessagePresenter;
import com.producerkafka.producer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerControllerImpl implements ProducerController {

    private final ProducerService service;

    @Override
    public ResponseEntity<?> send(MessagePresenter presenter) {

        service.send(presenter);

        return ResponseEntity.ok().build();
    }
}
