package com.consumerkafka.consumer.presenter;

import com.consumerkafka.consumer.model.MessageDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessagePresenter {

    private MessageDto data;
}
