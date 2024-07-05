package com.fms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fms.model.User;
import com.fms.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public String userSignup() {
		return "signup";
	}
	
	
	@PostMapping("/submit-form")
	public String userSubmit( User user, Model model) {
	
		userService.saveUser(user, model);
		model.addAttribute("msg","User Registered Successfully...");
		return "signup";
	}
}
