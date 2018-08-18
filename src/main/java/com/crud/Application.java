package com.crud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author CKolambe
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.crud.data.repository" })
@EntityScan(basePackages = { "com.crud.data.entity" })
public class Application {
	
	/**
	 * Logger Instance.
	 */
	final static Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	/**
	 * Main method to start the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		LOGGER.info("In Main method");
	}

}