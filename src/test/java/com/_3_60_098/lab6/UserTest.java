/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


package com._3_60_098.lab6;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shahr
 */
public class UserTest {

    private User user;
    private Category food;
    private PaymentMethod card;

    @BeforeEach
    public void setUp() {
        user = new User("Test User", "test@example.com");
        food = new Category("Food", "Meals and groceries");
        card = new PaymentMethod("Visa");
    }

    @Test
    public void testGetTotalExpenses() {
        Expense e1 = new Expense("Pizza", 20.0, LocalDate.now(), food, card);
        Expense e2 = new Expense("Burger", 15.0, LocalDate.now(), food, card);

        user.addExpense(e1);
        user.addExpense(e2);

        assertEquals(35.0, user.getTotalExpenses(), 0.001);
    }

    @Test
    public void testGetTotalExpenses_Empty() {
        assertEquals(0.0, user.getTotalExpenses(), 0.001);
    }
}