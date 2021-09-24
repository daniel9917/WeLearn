package com.proyecto.springboot.form.entities;

import java.util.Objects;

public class VideoResource extends Resource{
	
	private int lenght_ms;
	
	public VideoResource(VideoResource R) {
		// TODO Auto-generated constructor stub
		this.name = "";
		this.url = "";
		this.lenght_ms = 0;
		
		if (!(Objects.isNull(R))) {
			if (!(Objects.isNull(R.getName()))) {
				this.setName(R.getName()); 
			}	
			if (!Objects.isNull((R.getUrl()))) {
				this.setUrl(R.getUrl());
			}
			if (!Objects.isNull(R.getLenght_ms()) || R.getLenght_ms() != 0) {
				this.setLenght_ms(R.getLenght_ms());
			}			
		}

	}

	@Override
	public String deploy() {		 
		return "The video is ready to play.";
	}
	
	public VideoResource(String name, String url, int lenght_ms) {
		this.setName(name);
		this.setUrl(url);
		this.setLenght_ms(lenght_ms);	
	}

	public int getLenght_ms() {
		return lenght_ms;
	}

	public void setLenght_ms(int lenght_ms) {
		this.lenght_ms = lenght_ms;
	}
	
	@Override
	public String type() {		 
		return "video";
	}
	
	
	

}
