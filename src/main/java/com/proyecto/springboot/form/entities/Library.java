package com.proyecto.springboot.form.entities;



public class Library {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	//@Column
	private String name;

//	@OneToOne
//	@JoinColumn(name = "address_id")
//	@RestResource(path = "libraryAddress", rel = "address")
	private Address address;

	public Library() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Library(long id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
