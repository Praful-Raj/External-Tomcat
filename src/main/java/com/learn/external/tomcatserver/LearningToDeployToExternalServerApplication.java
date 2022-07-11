package com.learn.external.tomcatserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import com.learn.external.tomcatserver.LearningToDeployToExternalServerApplication;

@SpringBootApplication
public class LearningToDeployToExternalServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LearningToDeployToExternalServerApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(LearningToDeployToExternalServerApplication.class);
	}

}
