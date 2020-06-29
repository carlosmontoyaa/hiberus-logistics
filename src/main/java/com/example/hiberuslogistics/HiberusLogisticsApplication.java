package com.example.hiberuslogistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HiberusLogisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiberusLogisticsApplication.class, args);
	}

}
