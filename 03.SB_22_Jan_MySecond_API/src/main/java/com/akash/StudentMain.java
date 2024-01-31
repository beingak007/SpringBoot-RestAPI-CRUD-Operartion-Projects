package com.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class StudentMain {

	public static void main(String[] args) {
		SpringApplication.run(StudentMain.class, args);
		
		System.err.println("I Am Firing 🚀");
	}

}
