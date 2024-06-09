package org.provider.paymentprovider.model;

import lombok.*;
import org.provider.paymentprovider.model.enumUtil.*;
import org.springframework.beans.factory.annotation.Value;
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
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "transaction")
public class Transaction {

    @Id
    private BigInteger id;

    @Column(value = "payment_method")
    private PaymentMethod paymentMethod;

    @Column(value = "transaction_type")
    private TransactionType transactionType;

    @CreatedDate
    @Column(value = "create_at")
    private LocalDateTime createAt;
    @LastModifiedDate
    @Column(value = "update_at")
    private LocalDateTime updateAt;

    @Column(value = "response_status")
    private Status responseStatus;
    @Column(value = "request_status")
    private Status requestStatus;

    @Column(value = "from_bank_account_Id")
    private BigInteger fromBankAccountId;
    @Column(value = "to_bank_account_Id")
    private BigInteger toBnkAccountId;

    @Column(value = "currency")
    private Currency currency;

    @Column(value = "amount")
    private BigInteger amount;

    @Column(value = "language")
    private Language language;

    @Column(value = "message")
    private Message message;

    @Value("${notificationURL}")
    @Column(value = "notification_url")
    private String notificationURL;

    @Column(value = "web_hook_id")
    private WebHook webHook;

}
