package org.provider.paymentprovider.service;

import lombok.RequiredArgsConstructor;
import org.provider.paymentprovider.dto.TransactionDTO;
import org.provider.paymentprovider.model.Transaction;
import org.provider.paymentprovider.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public List<TransactionDTO> gettingListOfTransactionsForThePeriod(LocalDate startDate, LocalDate endDate) {
        return new ArrayList<>();
    }
}
