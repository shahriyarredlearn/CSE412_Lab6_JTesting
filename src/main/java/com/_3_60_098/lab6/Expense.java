/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shahr
 */package com._3_60_098.lab6;
 
 
import java.time.LocalDate;

public class Expense {
    private String title;
    private double amount;
    private LocalDate date;
    private Category category;
    private PaymentMethod paymentMethod;

    public Expense(String title, double amount, LocalDate date, Category category, PaymentMethod paymentMethod) {
        this.title = title;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
