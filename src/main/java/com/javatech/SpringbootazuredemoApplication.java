package com.javatech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootazuredemoApplication {
	
	@GetMapping("/pgr")
	public String getmessage() {
		return "my first program on azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootazuredemoApplication.class, args);
	}

}
