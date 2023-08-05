package com.example.ads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.ads.repository.*")
@SpringBootApplication
public class IpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpsApplication.class, args);

	}

}
