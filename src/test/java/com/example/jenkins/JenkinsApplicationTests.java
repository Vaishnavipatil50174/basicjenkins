package com.example.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	// Correct logger type
	private static final Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing");
		logger.info("Test case executing second log statements");
		Assertions.assertEquals(true, true);
	}
}

