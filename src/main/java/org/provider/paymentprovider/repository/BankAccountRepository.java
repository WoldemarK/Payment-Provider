package org.provider.paymentprovider.repository;

import org.provider.paymentprovider.model.BankAccount;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends R2dbcRepository<BankAccount, Long> {
}
