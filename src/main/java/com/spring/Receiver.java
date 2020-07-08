package com.spring;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "queue1", containerFactory = "jmsListenerContainerFactory")
    public void receiveMessage(Message msg) {
        System.out.println("Received <" + msg.getPayload().toString() + ">");
    }

}
