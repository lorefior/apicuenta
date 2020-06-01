package com.lorefior.cash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lorefior.cash.model.Loan;
import com.lorefior.cash.model.User;
import com.lorefior.cash.repository.UserRepository;
import com.lorefior.cash.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
//	@GetMapping("/users")
//	public ResponseEntity<?> getUsers() {
//		List<User> result = service.getListUsuario();
//		return new ResponseEntity<>(result, HttpStatus.OK);
//	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable long id){
		Optional user = service.getUsuario(id);
		if (user.isPresent()) {
			return new ResponseEntity<>(user, HttpStatus.OK);
			
		} else {
			return new ResponseEntity<>("no encotrado", HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/alta")
	public ResponseEntity<User> altaUsuario(@RequestBody User user){
		User result = service.altaUser(user);
		return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/user/{id}")
	   public ResponseEntity<?> deleteProducto(@PathVariable Long id) {
          service.deleteUser(id);
		return new ResponseEntity<>("Registro eliminado", HttpStatus.OK);
		} 
}
