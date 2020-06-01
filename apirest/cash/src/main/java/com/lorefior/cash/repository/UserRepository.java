package com.lorefior.cash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lorefior.cash.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
