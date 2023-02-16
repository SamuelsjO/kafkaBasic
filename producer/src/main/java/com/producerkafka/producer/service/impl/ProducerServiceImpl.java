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

    private final KafkaTemplate<String, List<MessagePresenter>> kafkaTemplate;

    @Override
    public void send(List<MessagePresenter> items) {

        items.forEach(account -> {
            kafkaTemplate.send("topic-1", List.of(account));

        });
    }
}
