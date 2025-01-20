package com.example.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest

class JenkinsApplicationTests {

	public  static Logger logger= (Logger) LoggerFactory.getLogger(JenkinsApplication.class);

	@Test
	void contextLoads() {
		logger.info("test case executing");
		Assertions.assertEquals(true,true);
	}

}
