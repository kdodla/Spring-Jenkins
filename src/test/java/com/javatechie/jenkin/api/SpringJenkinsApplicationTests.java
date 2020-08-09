package com.javatechie.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	Logger logger=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.info("I am in testing contextLoads");
		
		logger.info("I am in testing contextLoads  2222222");
		assertEquals(true,true);
	}

}
