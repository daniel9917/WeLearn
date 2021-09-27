package com.proyecto.springboot.form.entities;

import java.util.Objects;

public class DocumentResource extends Resource  implements IResource{
	
	private int num_pages;
	
	
	public DocumentResource(DocumentResource R) {
		// TODO Auto-generated constructor stub
		this.name = "";
		this.url = "";
		this.num_pages = 0;
		
		if (!(Objects.isNull(R))) {
			if (!(Objects.isNull(R.getName()))) {
				this.setName(R.getName()); 
			}	
			if (!Objects.isNull((R.getUrl()))) {
				this.setUrl(R.getUrl());
			}
			if (!Objects.isNull(R.getNum_pages()) || R.getNum_pages() != 0) {
				this.setNum_pages(R.getNum_pages());
			}			
		}
	}
	
	public DocumentResource(String name, String url, int num_pages) {
		this.setName(name);
		this.setUrl(url);
		this.setNum_pages(num_pages);	
		

	}		
	
	@Override
	public String deploy() {		 
		return "The document is ready to read.";
	}


	public int getNum_pages() {
		return num_pages;
	}


	public void setNum_pages(int num_pages) {
		this.num_pages = num_pages;
	}
	
	@Override
	public String type() {		 
		return "document";
	}
	
	
	
	

}
