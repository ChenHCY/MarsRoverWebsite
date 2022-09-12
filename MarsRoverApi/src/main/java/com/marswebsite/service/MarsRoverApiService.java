package com.marswebsite.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.marswebsite.response.MarsRoverApiResponse;

@Service
public class MarsRoverApiService { /*Create a Service*/
	
	public MarsRoverApiResponse getRoverData() {
		
	    RestTemplate rt = new RestTemplate();
	    
	    ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=DEMO_KEY", MarsRoverApiResponse.class);
	    
	    return response.getBody();
	}
}
