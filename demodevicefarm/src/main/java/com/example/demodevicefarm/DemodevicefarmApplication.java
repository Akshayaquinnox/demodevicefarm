package com.example.demodevicefarm;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DemodevicefarmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemodevicefarmApplication.class, args);
	}

}
