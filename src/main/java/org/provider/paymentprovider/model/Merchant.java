package org.provider.paymentprovider.model;

import lombok.*;
import org.provider.paymentprovider.model.enumUtil.Status;
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
@Table(value = "merchant")
public class Merchant {

    @Id
    private BigInteger id;

    @Column(value = "bank_account_id")
    private BigInteger bankAccountId;

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
    @Column(value = "secret_key")

    private String secretKey;
}
