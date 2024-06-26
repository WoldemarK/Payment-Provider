package org.provider.paymentprovider.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.provider.paymentprovider.model.WebHook;
import org.provider.paymentprovider.model.enumUtil.*;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigInteger;
import java.time.LocalDateTime;

import static com.fasterxml.jackson.annotation.JsonInclude.*;

@Builder
@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class TransactionDTO {

    private BigInteger id;
    private PaymentMethod paymentMethod;
    private TransactionType transactionType;

    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private Status responseStatus;
    private Status requestStatus;

    private BigInteger fromBankAccountId;
    private BigInteger toBnkAccountId;

    private Currency currency;
    private BigInteger amount;
    private Language language;
    private Message message;
    @Value("${notificationURL}")
    private String notificationURL;
    private WebHook webHook;
}
