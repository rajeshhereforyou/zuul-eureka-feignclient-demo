package com.example.zuuleurekafeignclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulEurekaFeignclientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEurekaFeignclientDemoApplication.class, args);
	}

}
