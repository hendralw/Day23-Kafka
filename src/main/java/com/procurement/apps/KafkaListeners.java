package com.procurement.apps;

import ch.qos.logback.core.net.SyslogOutputStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListeners {
    @KafkaListener(topics = "hello")
    public void subscribeHello(String data){
        log.info("[hello] received message: " + data);
    }
    @KafkaListener(topics = "book")
    public void subscribeBook(String data){
        log.info("[book] received message: " + data);
    }
    @KafkaListener(topics = "bag")
    public void subscribeBag(String data){
        log.info("[bag] received message: " + data);
    }
    @KafkaListener(topics = "pencil")
    public void subscribePencil(String data){
        log.info("[pencil] received message: " + data);
    }


}
