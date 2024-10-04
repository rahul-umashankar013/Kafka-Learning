package com.incedo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incedo.service.LocationService;

@RestController
public class LocationController {
	@Autowired
   private LocationService service;
	
	@PostMapping("/update")
	private String updateDriverLocation() {
		String loc="(" +Math.random()*100+","+Math.random()*100+")";
		service.updateLocation(loc);
		return "Location Updated";
	}
}
