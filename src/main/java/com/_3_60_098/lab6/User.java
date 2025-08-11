/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shahr
 */package com._3_60_098.lab6;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Expense> expenses;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public double getTotalExpenses() {
        return expenses.stream()
                       .mapToDouble(Expense::getAmount)
                       .sum();
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}
