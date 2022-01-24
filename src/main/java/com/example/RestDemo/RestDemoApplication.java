package com.example.RestDemo;

import javax.servlet.ServletContainerInitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestDemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServletContainerInitializer.class);
    }
}
