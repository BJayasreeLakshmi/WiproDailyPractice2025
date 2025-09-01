package com.wipro.usermgnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UsermgntApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermgntApplication.class, args);
	}

}
