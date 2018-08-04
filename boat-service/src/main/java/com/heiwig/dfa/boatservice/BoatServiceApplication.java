package com.heiwig.dfa.boatservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BoatServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoatServiceApplication.class, args);
	}
}
