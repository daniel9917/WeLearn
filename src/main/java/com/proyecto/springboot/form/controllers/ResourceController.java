package com.proyecto.springboot.form.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proyecto.springboot.form.entities.Resource;
import com.proyecto.springboot.form.factory.Factory;

import javassist.NotFoundException;

@RequestMapping("resources/")
public class ResourceController {
	
	List<Resource> resources;

	private Factory resourceFactory;
	
	public ResourceController() {
		// TODO Auto-generated constructor stub
		this.resources = new ArrayList<Resource>(); 
		resourceFactory = Factory.getInstance();
	}
	
	@GetMapping
	public @ResponseBody List<Resource> getResources() {
		return this.resources;
	}
	
	@PostMapping("/{type}")
	public @ResponseBody Resource addResource(@RequestBody Resource r, @PathVariable String type) throws NotFoundException {
		//Se fabrica el recurso.
		Resource actual = this.resourceFactory.createResource(type, r);		
		this.resources.add(actual);
		return r;
	}

}
