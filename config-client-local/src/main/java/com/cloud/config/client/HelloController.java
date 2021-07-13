package com.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
//@Profile("development")
public class HelloController {
	@Value("${client.greeting}")
	private String value;

	@GetMapping("/hello")
	public String hello() {
		return value;
	}
}
