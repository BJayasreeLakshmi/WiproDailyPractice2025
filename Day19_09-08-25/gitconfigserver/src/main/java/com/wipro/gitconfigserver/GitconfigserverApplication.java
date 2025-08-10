package com.wipro.gitconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class GitconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitconfigserverApplication.class, args);
	}

}
