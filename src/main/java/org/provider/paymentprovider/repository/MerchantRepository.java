package org.provider.paymentprovider.repository;

import org.provider.paymentprovider.model.Merchant;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends R2dbcRepository<Merchant, String> {
}
