package com.cloud.hellojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Adding comments to the code
 * comment updated by user1
 * @author Coder
 *
 */

@SpringBootApplication
public class HelloJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloJavaApplication.class, args);
		logMessage();
	}

	private static void logMessage() {
		System.out.println("The application started successfully");
	}
}
