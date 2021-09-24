package com.proyecto.springboot.form.entities;

public abstract class Resource {
		
	protected String name;
	protected String url;	
	
	public abstract String deploy();
	public abstract String type();
	
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
	
	
		
	

}
