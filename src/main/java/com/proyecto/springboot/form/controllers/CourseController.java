package com.proyecto.springboot.form.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.form.entities.Course;

@RestController
@RequestMapping("courses/")
public class CourseController {
	
	List<Course> courses;
	
	public CourseController() {
		// TODO Auto-generated constructor stub
		courses = new ArrayList<Course>();
	}
	
	@GetMapping
	public @ResponseBody List<Course> getCourses(){
		return this.courses;
	}
	
	@PostMapping
	public @ResponseBody Course addCourses(@RequestBody Course c){
		this.courses.add(c);
		return c;
	}
	
	
	
	

}
