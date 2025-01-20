package com.example.jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	// Correct way to declare SLF4J logger
	private static final Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		logger.info("Application is executed");

		SpringApplication.run(JenkinsApplication.class, args);
	}
}
