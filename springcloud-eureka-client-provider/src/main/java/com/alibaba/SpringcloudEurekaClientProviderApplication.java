package com.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudEurekaClientProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaClientProviderApplication.class, args);
	}
}
