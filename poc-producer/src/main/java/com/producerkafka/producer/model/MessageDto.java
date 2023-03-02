package com.producerkafka.producer.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageDto {

    private String idSitProcm;
    private Integer codOrigMovto;
    private String commentsLog;
    private String originAccount;
    private LocalDate paymentDate;
    private Integer originBranch;
    private String referenceNumber;
    private Integer transactionReason;
    private Integer reasonCodeId;
    private Integer transactionCodeId;
    private BigDecimal amount;
    private String productNumber;
    private String operationId;
    private String consumerNumber;

}
