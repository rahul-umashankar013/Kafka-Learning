package com.incedo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	@Autowired
	 private KafkaTemplate<String,String> template;
     public boolean updateLocation(String location)
     {
    	 template.send("location-topic",location);
    	 return true;
     }
}
