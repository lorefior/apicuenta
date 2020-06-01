package com.lorefior.cash.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.lorefior.cash.model.Loan;
import com.lorefior.cash.model.User;



@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>, PagingAndSortingRepository<Loan, Long>{
	
}
