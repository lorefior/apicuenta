package com.lorefior.cash.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lorefior.cash.model.Loan;
import com.lorefior.cash.model.User;

@Controller

public class CashController {
	
	@GetMapping("/cash")
		public String createUsuario(User user) {
			
			return "cash";
		}
	
	@GetMapping("/users")
	public String createUsuario(Model model) {
		return "users";
	}
	
	@GetMapping("/buscador")
	public String searchUser1(User user) {
		return "buscador";
	}
	
	@GetMapping("/altaUser")
	public String searchUser(User user) {
		return "altaUser";
	}
}
