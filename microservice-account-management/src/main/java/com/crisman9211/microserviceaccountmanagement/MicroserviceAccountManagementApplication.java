package com.crisman9211.microserviceaccountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAccountManagementApplication.class, args);
	}

}
