package com.proyecto.springboot.form.entities.DTO;

public class ResourceDTO {
	
	private String name;
	private String url;	
	private int num_pages;
	private int lenght_ms;
	
	public ResourceDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ResourceDTO(String name, String url, int num_pages, int lenght_ms) {
		super();
		this.name = name;
		this.url = url;
		this.num_pages = num_pages;
		this.lenght_ms = lenght_ms;
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
	public int getNum_pages() {
		return num_pages;
	}
	public void setNum_pages(int num_pages) {
		this.num_pages = num_pages;
	}
	public int getLenght_ms() {
		return lenght_ms;
	}
	public void setLenght_ms(int lenght_ms) {
		this.lenght_ms = lenght_ms;
	}
	
	
	
}
