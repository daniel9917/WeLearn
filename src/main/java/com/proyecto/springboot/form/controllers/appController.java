package com.proyecto.springboot.form.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class appController {
	
	@GetMapping()
	public String hello () {
		return "hello from WeLearn";
	}

}
