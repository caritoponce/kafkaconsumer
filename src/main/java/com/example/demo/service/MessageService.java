package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Slf4j
@EnableBinding(Sink.class)
@Service
public class MessageService {

    @StreamListener(Sink.INPUT)
    public void read(Message<String> message){
        log.info("message: " + message.getPayload());
    }

    @StreamListener(Sink.INPUT)
    public void read(com.example.demo.model.Message message){
        log.info("message: " + message);
    }

}
