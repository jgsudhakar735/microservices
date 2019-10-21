package com.jayagovind.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
// Enabling the Eurekha Client. So that this will get registered with Eurekhs server
@EnableDiscoveryClient
//@EnableFeignClients("com.jayagovind.spring")
public class SpringAuthenticationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthenticationServiceApplication.class, args);
	}

}
