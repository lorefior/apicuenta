package com.lorefior.cash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorefior.cash.model.User;
import com.lorefior.cash.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public Optional<User> getUsuario(long id) {
		Optional<User> user;
		user = userRepository.findById(id);
		return user;
	}

	public List<User> getListUsuario() {

		return userRepository.findAll();
		}

	
	public User altaUser(User user) {
		User userok = userRepository.save(user);
		System.out.println(userok);
		return user;
	}
	
	public String deleteUser(Long id) {
		userRepository.deleteById(id);
		System.out.println("se elimino el registro" + id);
		return "Eliminado";
	}
}
