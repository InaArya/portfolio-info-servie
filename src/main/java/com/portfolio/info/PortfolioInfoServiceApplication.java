package com.portfolio.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PortfolioInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioInfoServiceApplication.class, args);
	}

}
