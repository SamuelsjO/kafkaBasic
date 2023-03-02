package com.producerkafka.producer.service;

import com.producerkafka.producer.presenter.MessagePresenter;

public interface ProducerService {

    void send(MessagePresenter presenter);
}
