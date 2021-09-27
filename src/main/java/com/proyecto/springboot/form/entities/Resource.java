package com.proyecto.springboot.form.entities;

public class Resource{
		
	protected String name;
	protected String url;	
	

	
	public Resource() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public Resource(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
}
