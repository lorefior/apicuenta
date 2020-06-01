package com.lorefior.cash.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import com.lorefior.cash.model.Loan;
import com.lorefior.cash.model.User;
import com.lorefior.cash.repository.LoanRepository;


@Service
public class LoanService {
	@Autowired
	LoanRepository repo;
	@Autowired
	UserService serv;

	public List<Loan> getAllLoans() {
		return repo.findAll();
	}
	
	public List<Loan> getAllLoansByUser(Long id)  {

		return repo.findAll();
		
	}
	

}
