package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entity.Theatre;
import com.cap.model.ScreenInfo;
import com.cap.service.AddScreenServiceIn;

@RestController
@CrossOrigin("http://localhost:9090")
public class AddScreenController {
	
	@Autowired
	private AddScreenServiceIn service;
	
	@PostMapping("/add/screen")
	public String addScreen(@RequestBody ScreenInfo screenInfo) {
		ScreenInfo m = service.addScreen(screenInfo);
		if(m != null) {
			return "Screen was added successfully!!";
		}
		else {
			return "Sorry, screen was not added";
		}
	}
}

