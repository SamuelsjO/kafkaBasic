package com.producerkafka.producer.presenter;

import com.producerkafka.producer.model.MessageDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessagePresenter {

    private MessageDto data;
}
