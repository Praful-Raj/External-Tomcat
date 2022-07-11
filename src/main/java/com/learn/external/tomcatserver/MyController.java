package com.learn.external.tomcatserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String home() {
		return "Hey Praful! I Am From External Tomcat Deployment";
	}
}
