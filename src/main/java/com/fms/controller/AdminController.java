package com.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fms.model.User;
import com.fms.services.UserService;

@Controller
public class AdminController {
	
	@Autowired
	UserService  userService;
	
	@GetMapping("/admin")
	public String adminDashboar(Model model)
	{
		System.out.println("admin -- contlller  ");
		List<User> listOfUser = userService.listOfUser();
		model.addAttribute("alluser",listOfUser);
		
		return "admin-dashbaord";
	}

}
