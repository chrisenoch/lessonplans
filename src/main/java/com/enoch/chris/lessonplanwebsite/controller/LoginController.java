package com.enoch.chris.lessonplanwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		

		return "fancy-login";

	}

	@GetMapping("/access-denied")
	public String showAccDenied() {

		return "access-denied";

	}
}
