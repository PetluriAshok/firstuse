package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringBootHelloWorldExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootHelloWorldExampleApplication.class, args);

	}
}