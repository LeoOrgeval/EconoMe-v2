package com.econome.service;

import com.econome.model.Transaction;

import java.util.List;

public interface ITransactionService {
    void addTransaction(Transaction transaction);
    List<Transaction> getTransactions();
    List<Transaction> getTransactionsByType(String type);
    Double getTotalTransactionsByType(String type);
}
