package org.secfirst.umbrella.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.secfirst.umbrella.backend")
public class UmbrellaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmbrellaBackendApplication.class, args);
	}
}
