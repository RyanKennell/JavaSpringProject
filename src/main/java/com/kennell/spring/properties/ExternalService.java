package com.kennell.spring.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalService {
	
	//external.service.url
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceURL() {
		return url;
	}
}
