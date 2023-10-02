package com.javatechie.crud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("module-service")
public class SpringBootCrudTravel5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudTravel5Application.class, args);
	}

}
