package com.proyecto.springboot.form.factory;

import com.proyecto.springboot.form.entities.DocumentResource;
import com.proyecto.springboot.form.entities.Resource;
import com.proyecto.springboot.form.entities.VideoResource;
import com.proyecto.springboot.form.entities.DTO.ResourceDTO;

import javassist.NotFoundException;

public class Factory implements Fabricator {
	
	private static Factory Instance;
	
	
	public static Factory getInstance () {
		if (!(Instance == null)) {
			return Instance;
		}
		else {
			return new Factory ();
		}
	}
	
	private Factory () {
		
	}

	@Override
	public Resource createResource(String type, ResourceDTO R) throws NotFoundException {
		switch (type) {
			case "video":
				return new VideoResource(R.getName(), R.getUrl(), R.getLenght_ms());
			case "document":
				return new DocumentResource(R.getName(), R.getUrl(),R.getNum_pages());
			default :
				throw new NotFoundException("No se encontro el tipo de recurso.");
		} 
		
	}

	@Override
	public String type() {
		return "Im a Resource Factory.";
	}

}
