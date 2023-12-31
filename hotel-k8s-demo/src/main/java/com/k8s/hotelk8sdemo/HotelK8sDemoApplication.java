package com.k8s.hotelk8sdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelK8sDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelK8sDemoApplication.class, args);
	}

}
