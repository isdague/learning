package com.learning.example.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.example.model.User;
import com.learning.example.service.UserService;
import com.learning.example.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	@Autowired
	UserService userService;

	@ModelAttribute("user")
	public UserRegistrationDto registrationDto() {
		return new UserRegistrationDto();
	}

	@GetMapping
	public String showRegistrationForm(Model model) {
		return "registration";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto registrationDto,
			BindingResult bindingResult) {

		User existing = userService.findByEmail(registrationDto.getEmail());
		if (existing != null) {
			bindingResult.reject("email " + registrationDto.getEmail() + " is already registered");
		}

		if (bindingResult.hasErrors()) {
			return "registration";
		}

		userService.save(registrationDto);
		return "redirect:/registration?success";

	}

}
