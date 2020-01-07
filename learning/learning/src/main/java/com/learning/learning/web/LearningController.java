package com.learning.learning.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearningController {

	@GetMapping("/getLearning")
	public String getLearning() {
		return "getLearning";
	}
	
	@PostMapping("/postLearning")
	public String postLearning() {
		return "postLearning";
	}
	
}