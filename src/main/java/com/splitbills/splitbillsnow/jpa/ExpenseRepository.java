package com.splitbills.splitbillsnow.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.splitbills.splitbillsnow.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Integer>{

}
