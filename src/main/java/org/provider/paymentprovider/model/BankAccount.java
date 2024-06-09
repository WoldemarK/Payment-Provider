package org.provider.paymentprovider.model;

import lombok.*;
import org.provider.paymentprovider.model.enumUtil.Currency;
import org.provider.paymentprovider.model.enumUtil.UserType;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


import java.math.BigInteger;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "bank_account")
public class BankAccount {

    @Id
    private BigInteger id;

    @Column(value = "owner_Id")
    private Customer ownerId;

    @Column(value = "currency")
    private Currency currency;

    @Column(value = "balance")
    private BigInteger balance;

    @Column(value = "user_type")
    private UserType userType;

}
