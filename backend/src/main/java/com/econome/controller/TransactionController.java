package com.econome.controller;

import com.econome.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.econome.service.TransactionService;
import com.econome.model.Transaction;
import com.econome.model.Income;
import com.econome.model.Expense;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // Add a transaction
    @PostMapping
    public void addTransaction(@RequestBody Transaction transaction) {
        transactionService.addTransaction(transaction);
    }

    // Get all transactions
    @GetMapping
    public List<Transaction> getTransactions() {
        return transactionService.getTransactions();
    }

    // Get transactions by type
    @GetMapping("/type/{type}")
    public List<Transaction> getTransactionsByType(@PathVariable String type) {
        return transactionService.getTransactionsByType(type);
    }

    // Get total transactions by type
    @GetMapping("/total/{type}")
    public Double getTotalTransactionsByType(@PathVariable String type) {
        return transactionService.getTotalTransactionsByType(type);
    }

}
