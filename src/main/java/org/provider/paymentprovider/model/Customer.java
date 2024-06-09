package org.provider.paymentprovider.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "customer")
public class Customer {

    @Id
    private BigInteger id;

    @Column(value = "first_name")
    private String firstName;

    @Column(value = "last_name")
    private String lastName;

    @Column(value = "country")
    private String country;

    private List<Card>cards;
}
