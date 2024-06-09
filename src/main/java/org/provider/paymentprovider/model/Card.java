package org.provider.paymentprovider.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigInteger;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "card")
public class Card {

    @Id
    private BigInteger cardNumber;

    @Column(value = "exp_date")
    private long expDate;

    @Column(value = "cvv")
    private int cvv;

    @Column(value = "customer_id")
    private BigInteger customerId;

    @Column(value = "balance")
    private BigInteger balance;
}

