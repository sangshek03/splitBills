package com.splitbills.splitbillsnow.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.splitbills.splitbillsnow.model.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Integer>{

}
