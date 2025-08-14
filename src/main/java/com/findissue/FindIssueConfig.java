package com.findissue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.models.OpenAPI;


@Configuration
public class FindIssueConfig {

	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	 @Bean
	 public OpenAPI getOpenAPI() {
	    return new OpenAPI();
	            
        }
	 
}
