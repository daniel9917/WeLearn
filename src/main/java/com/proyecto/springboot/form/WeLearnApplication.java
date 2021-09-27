package com.proyecto.springboot.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class WeLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeLearnApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/")
				.allowedOrigins("http://localhost:8080","http://localhost:4200","http://localhost");
				
				registry.addMapping("/courses/")				
				.allowedOrigins("http://localhost:8080","http://localhost:4200","http://localhost");
				
				registry.addMapping("/resources/")
				.allowedOrigins("http://localhost:8080","http://localhost:4200","http://localhost");
				
				registry.addMapping("/users/")
				.allowedOrigins("http://localhost:8080","http://localhost:4200","http://localhost");
								
				registry.addMapping("/resources/{type}")
				.allowedOrigins("http://localhost:8080","http://localhost:4200","http://localhost");
			}
		};
	}

}
