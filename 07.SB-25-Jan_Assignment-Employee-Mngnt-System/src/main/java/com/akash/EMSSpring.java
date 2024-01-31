package com.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class EMSSpring {

	public static void main(String[] args) {
		SpringApplication.run(EMSSpring.class, args);
		System.err.println("I am Firing Boss🚀🚀");
	}

}
