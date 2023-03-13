package com.msk;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MskApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MskApplication.class);
	
	public static void main(String[] args) {
		
	 SpringApplication.run(MskApplication.class, args);
	}
	 @Bean(name = "appRestClient")
	    public RestTemplate getRestClient() {
		 LOGGER.info("created bean...");
	        RestTemplate restClient = new RestTemplate(
	                new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

	        // Add one interceptor like in your example, except using anonymous class.
	        restClient.setInterceptors(Collections.singletonList((request, body, execution) -> {

	            LOGGER.info("Intercepting...");
	            return execution.execute(request, body);
	        }));

	        return restClient;
	    }
}
