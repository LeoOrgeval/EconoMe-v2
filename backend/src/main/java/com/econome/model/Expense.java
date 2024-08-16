package com.econome.model;

import java.time.LocalDate;

public class Expense extends Transaction {
    // Expense category
    private String category;

    public Expense(Long id, String description, Double amount, LocalDate date, String category) {
        super(id, description, amount, date, "Expense");
        this.category = category;
    }

    // Getters and Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
