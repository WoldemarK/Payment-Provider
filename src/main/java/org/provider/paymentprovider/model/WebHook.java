package org.provider.paymentprovider.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import org.provider.paymentprovider.model.enumUtil.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "web_hook")
public class WebHook {

    @Id
    private BigInteger id;

    @CreatedDate
    @Column(value = "create_at")
    private LocalDateTime createAt;
    @LastModifiedDate
    @Column(value = "update_at")
    private LocalDateTime updateAt;

    @Column(value = "transaction")
    private TransactionType transactionType;

    @Column(value = "payment_method")
    private PaymentMethod paymentMethod;

    @Column(value = "message")
    private Message message;

    @Column(value = "language")
    private Language language;

    @Column(value = "url")
    private String url;

    @Column(value = "response_status")
    private Status response;
    @Column(value = "request_status")
    private Status request;

    @Min(value = 1)
    @Max(value = 5)
    @Column(value = "count_attempt")
    private int attempt;

}


