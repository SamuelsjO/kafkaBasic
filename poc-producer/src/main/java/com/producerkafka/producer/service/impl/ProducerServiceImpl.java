package com.producerkafka.producer.service.impl;

import com.producerkafka.producer.presenter.MessagePresenter;
import com.producerkafka.producer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService {

    private final KafkaTemplate<String, MessagePresenter> kafkaTemplate;

    @Override
    public void send(MessagePresenter items) {


            kafkaTemplate.send("topic-1", items);

    }
}
