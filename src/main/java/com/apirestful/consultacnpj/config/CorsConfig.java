package com.apirestful.consultacnpj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/*")
		//TODO add frontend endpoint to acces backend
		.allowedOrigins("http://127.0.0.1:5500/")
		.allowedHeaders("GET");
		
	}
}
