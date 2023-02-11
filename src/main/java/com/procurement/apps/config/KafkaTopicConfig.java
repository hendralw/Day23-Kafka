package com.procurement.apps.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic helloTopic(){
        return TopicBuilder.name("hello").build();
    }

    @Bean
    public NewTopic bookTopic(){
        return TopicBuilder.name("book").build();
    }

    @Bean
    public NewTopic bagTopic(){
        return TopicBuilder.name("bag").build();
    }

    @Bean
    public NewTopic pencilTopic(){
        return TopicBuilder.name("pencil").build();
    }
}
