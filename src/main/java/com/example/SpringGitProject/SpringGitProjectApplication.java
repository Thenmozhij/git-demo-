package com.example.SpringGitProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Book;

@SpringBootApplication
@RestController
public class SpringGitProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGitProjectApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "Welcome to the portal";
	}
	
	@GetMapping("/check")
	public ResponseEntity<Book> check() {
		
		return new ResponseEntity<>(new Book(1L,"Book1"),HttpStatus.OK);
	}
	
	

}
