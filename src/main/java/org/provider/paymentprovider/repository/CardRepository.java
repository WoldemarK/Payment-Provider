package org.provider.paymentprovider.repository;

import org.provider.paymentprovider.model.Card;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends R2dbcRepository<Card, Long> {
}
