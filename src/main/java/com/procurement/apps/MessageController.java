package com.procurement.apps;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
    private KafkaTemplate<String,String> kafkaTemplate;

    public MessageController(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/hello")
    public void hello(@RequestBody MessageRequest request){
        kafkaTemplate.send("hello", request.message());
    }
    @PostMapping("/book")
    public void book(@RequestBody MessageRequest request){
        kafkaTemplate.send("book", request.message());
    }
    @PostMapping("/bag")
    public void bag(@RequestBody MessageRequest request){
        kafkaTemplate.send("bag", request.message());
    }
    @PostMapping("/pencil")
    public void pencil(@RequestBody MessageRequest request){
        kafkaTemplate.send("pencil", request.message());
    }
}
