package com.lorefior.cash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lorefior.cash.model.Loan;
import com.lorefior.cash.service.LoanService;

@Controller
public class LoanController {

	@Autowired
	LoanService servi;

	@GetMapping("/loans")
	public ResponseEntity<?> getUser() {
		//@PageableDefault(page=0, size=5)
		List<Loan> result = servi.getAllLoans();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping("/loan/{id}")
	public ResponseEntity<?> getUserbyIdUser(@PathVariable Long id) {
		List<Loan> result = servi.getAllLoansByUser(id);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
