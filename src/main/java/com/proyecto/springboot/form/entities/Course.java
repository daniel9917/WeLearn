package com.proyecto.springboot.form.entities;

import java.util.List;


public class Course {
	
	private Long id;
	
	private String name;
	
	private User founder;
	
	private List<Resource> resources;
			
	private List <User> estudiantes;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getFounder() {
		return founder;
	}

	public void setFounder(User founder) {
		this.founder = founder;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public List<User> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<User> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
