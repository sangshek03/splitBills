package com.splitbills.splitbillsnow.service;

import com.splitbills.splitbillsnow.jpa.ExpenseRepository;
import com.splitbills.splitbillsnow.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Optional<Expense> getExpenseById(int expenseId) {
        return expenseRepository.findById(expenseId);
    }

    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public Expense updateExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void deleteExpense(int expenseId) {
        expenseRepository.deleteById(expenseId);
    }
}
