package com.proyecto.springboot.form.entities;

public class Address {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
//	@Column(nullable = false)
	private String location;
	
//	@OneToOne(mappedBy = "address")
	private Library library;

	public Address() {	
		// TODO Auto-generated constructor stub
	}

	public Address(long id, String location, Library library) {
		super();
		this.id = id;
		this.location = location;
		this.library = library;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
	
	

	
}
