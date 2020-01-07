package com.learning.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/learning")
public class LearningController {

	@GetMapping("/getLearning")
	public String getLearning() {
		return "getLearning";
	}
	
}
