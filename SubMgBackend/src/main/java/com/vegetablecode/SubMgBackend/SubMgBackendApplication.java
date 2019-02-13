package com.vegetablecode.SubMgBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SubMgBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubMgBackendApplication.class, args);
	}

}