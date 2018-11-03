package com.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${server.port}")
	private int port;

	@RequestMapping("/hi")
	public String sayHi(@RequestParam String name) {
		return "hello " + name + ", the provider is " + port;
	}
}
