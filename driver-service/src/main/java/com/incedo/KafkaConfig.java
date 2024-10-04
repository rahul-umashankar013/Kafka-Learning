package com.incedo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
	@Bean
   protected NewTopic topic()
   {
	   return TopicBuilder.name("location-topic")
			   .partitions(1).replicas(1).build();
	   
	   
   }
}
