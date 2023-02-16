package com.producerkafka.producer.service;

import com.producerkafka.producer.presenter.MessagePresenter;

import java.util.List;

public interface ProducerService {

    void send(List<MessagePresenter> presenter);
}
