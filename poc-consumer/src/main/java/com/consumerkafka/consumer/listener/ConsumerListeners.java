package com.consumerkafka.consumer.listener;

import com.consumerkafka.consumer.presenter.MessagePresenter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsumerListeners {

  @KafkaListener(topics = "topic-1", groupId = "group-1")
  public void listen(@Payload MessagePresenter presenter){


//    presenter.forEach(message -> {
    System.out.println("Received in for: {}" + presenter);
    if (presenter != null) {
      log.info("Thread: {}", Thread.currentThread().getId());
      log.info("Received: {}", presenter);
    }
//    });
  }
}
