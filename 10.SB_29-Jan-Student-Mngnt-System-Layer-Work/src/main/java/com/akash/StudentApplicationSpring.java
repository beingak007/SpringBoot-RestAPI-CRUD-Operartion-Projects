package com.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.akash.model.Student;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class StudentApplicationSpring {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplicationSpring.class, args);
		System.err.println("I am Firing Boss 🚀🚀");
	}

}
