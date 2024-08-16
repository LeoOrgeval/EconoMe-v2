package com.econome.service;

import com.econome.model.Transaction;
import com.econome.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void addTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public List<Transaction> getTransactionsByType(String type) {
        return transactionRepository.findAll().stream()
                .filter(t -> t.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());    }

    @Override
    public Double getTotalTransactionsByType(String type) {
        return transactionRepository.findAll().stream()
                .filter(t -> t.getType().equalsIgnoreCase(type))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }
}
