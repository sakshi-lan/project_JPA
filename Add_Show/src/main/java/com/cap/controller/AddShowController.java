package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.model.ShowInfo;
import com.cap.service.AddShowServiceIn;

@RestController
@CrossOrigin("http://localhost:9090")
public class AddShowController {
	
	@Autowired
	private AddShowServiceIn service;
	
	@PostMapping("/add/show")
	public String addShow(@RequestBody ShowInfo show) {
		ShowInfo m = service.addShow(show);
		if(m != null) {
			return "Show was added successfully!!";
		}
		else {
			return "Sorry, show was not added";
		}
	}
}

