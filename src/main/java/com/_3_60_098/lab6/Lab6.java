/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com._3_60_098.lab6;
import java.time.LocalDate;
/**
 *
 * @author shahr
 */
public class Lab6{

    
        public static void main(String[] args) {
            User user = new User("John Doe", "john@example.com");

            Category food = new Category("Food", "Groceries and eating out");
            PaymentMethod creditCard = new PaymentMethod("Credit Card");

            Expense e1 = new Expense("Lunch", 12.5, LocalDate.now(), food, creditCard);
            Expense e2 = new Expense("Groceries", 45.0, LocalDate.now(), food, creditCard);

            user.addExpense(e1);
            user.addExpense(e2);

            System.out.println("Total Expenses: $" + user.getTotalExpenses());
        }
    }





