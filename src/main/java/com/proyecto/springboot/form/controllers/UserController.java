package com.proyecto.springboot.form.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.form.entities.User;

@RestController
@RequestMapping("users/")
public class UserController {
	
	
	List <User> users;
	
	
	public UserController() {
		// TODO Auto-generated constructor stub
		users = new ArrayList<User>();
	}
	
	@GetMapping
	public @ResponseBody List<User> getUsers() {
		return users;		
	}
	
	@PostMapping
	public @ResponseBody User createUser (@RequestBody User u) {
		this.users.add(u);
		return u;
	} 
	
}
