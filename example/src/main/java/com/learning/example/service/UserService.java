package com.learning.example.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.learning.example.model.User;
import com.learning.example.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User findByEmail(String email);
	
	User save(UserRegistrationDto userRegistrationDto);
	
}
