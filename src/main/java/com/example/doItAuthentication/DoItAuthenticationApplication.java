package com.example.doItAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@SpringBootApplication
public class DoItAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoItAuthenticationApplication.class, args);
	}

}
