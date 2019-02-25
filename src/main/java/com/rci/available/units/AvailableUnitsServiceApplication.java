package com.rci.available.units;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AvailableUnitsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvailableUnitsServiceApplication.class, args);
	}

}
