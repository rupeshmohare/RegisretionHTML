package com.example.html.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.html.entity.User;
import com.example.html.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping("/")
	public String register(Model model) {
		User user = new User();
		model.addAttribute("user", user);

		return "register";
	}

	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);

		service.registerUser(user);

		return "home";

	}

}
