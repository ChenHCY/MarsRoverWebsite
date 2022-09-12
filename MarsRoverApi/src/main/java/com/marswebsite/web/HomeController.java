package com.marswebsite.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.marswebsite.response.MarsRoverApiResponse;
import com.marswebsite.service.MarsRoverApiService;

@Controller
public class HomeController {
	@Autowired
	private MarsRoverApiService roverService;
	
    @GetMapping("/")
    public String getHomeView (ModelMap model) { /*ModelMap Like use HashMap*/
    	MarsRoverApiResponse roverData = roverService.getRoverData();
    	model.put("roverData", roverData); /*(key, value)*/
    	
	    return "index";
    }
}
