package com.gateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGateWayApplication.class, args);
	}

}
