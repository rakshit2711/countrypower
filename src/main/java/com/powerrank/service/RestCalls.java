package com.powerrank.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestCalls {
	@Autowired
	RestTemplate restTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(RestCalls.class);
	
	public <T,U> ResponseEntity<U> invokePostRequest(String url,HttpHeaders header, T requestObj,Class<U> responseObj){
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<T> entity=new HttpEntity<>(requestObj,header);
		ResponseEntity<U> responseEntity=null;
		try {
			responseEntity=restTemplate.exchange(url,HttpMethod.POST,entity, responseObj);
		}catch(Exception e) {
			log.error(e.getMessage()+e.getStackTrace());
		}
		return responseEntity;
	}
	public <T,U> ResponseEntity<U> invokeGetRequest(String url,HttpHeaders header, T requestObj,Class<U> responseObj){
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<T> entity=new HttpEntity<>(requestObj,header);
		ResponseEntity<U> responseEntity=null;
		try {
			responseEntity=restTemplate.exchange(url,HttpMethod.GET,entity, responseObj);
		}catch(Exception e) {
			log.error(e.getMessage()+e.getStackTrace());
		}
		return responseEntity;
	}
}
