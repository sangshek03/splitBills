package com.splitbills.splitbillsnow.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.splitbills.splitbillsnow.model.User;

public interface UserRepository extends JpaRepository<User,String>{

}
