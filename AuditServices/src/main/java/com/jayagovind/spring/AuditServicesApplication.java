package com.jayagovind.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuditServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditServicesApplication.class, args);
	}

}
