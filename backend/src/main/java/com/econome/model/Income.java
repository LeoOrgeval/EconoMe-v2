package com.econome.model;

import java.time.LocalDate;

public class Income extends Transaction {
    // Income source
    private String source;

    public Income(Long id, String description, Double amount, LocalDate date, String source) {
        super(id, description, amount, date, "Income");
        this.source = source;
    }

    // Getters and Setters
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
