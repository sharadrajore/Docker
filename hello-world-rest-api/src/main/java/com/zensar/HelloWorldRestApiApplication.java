package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldRestApiApplication.class, args);
		 System.out.println("Ram");
	}

}
