package com.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.akash.model.Bloging;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class BlogingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogingApplication.class, args);
		System.err.println("I am Firing Boss 🚀🚀");
	}

}
