package com.klef.soa.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WaterPurifierServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaterPurifierServiceApplication.class, args);
		System.out.println("Water Purifier is running");
	}

}
