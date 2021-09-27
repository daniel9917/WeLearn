package com.proyecto.springboot.form.factory;

import com.proyecto.springboot.form.entities.Resource;
import com.proyecto.springboot.form.entities.DTO.ResourceDTO;

import javassist.NotFoundException;

public interface Fabricator {
	
	public Resource createResource (String type, ResourceDTO r) throws NotFoundException;
	public String type ();

}
