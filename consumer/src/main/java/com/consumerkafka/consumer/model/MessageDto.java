package com.consumerkafka.consumer.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageDto {

    private String numberAccount;
    private String valueAccount;
    private String typeAccount;
    private String debitsFinanc;

}
