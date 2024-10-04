package com.incedo;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
	
	 @KafkaListener(topics="location-topic",groupId="1")
     public void updateLocation(String location)
     {
    	 System.out.println(location);
     }
}
