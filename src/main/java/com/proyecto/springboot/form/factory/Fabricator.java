package com.proyecto.springboot.form.factory;

import com.proyecto.springboot.form.entities.Resource;

import javassist.NotFoundException;

public interface Fabricator {
	
	public Resource createResource (String type, Resource r) throws NotFoundException;
	public String type ();

}
