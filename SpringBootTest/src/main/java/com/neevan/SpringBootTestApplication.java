package com.neevan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(SpringBootTestApplication.class);
		logger.info("Spring Boot is starting .....");
		SpringApplication.run(SpringBootTestApplication.class, args);
		logger.info("Spring Boot is after starting ....");
		logger.info("This is feature branch change...");
		logger.info("This is feature branch second change....");
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * System.out.println("Hello Naveen"); }
	 */

}
