package com.yourcompany.bookservice.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class OrderListener {
    @RabbitListener(queues = "order.book.queue")
    public void handleOrder(Map<String, Object> orderData) {
        System.out.println("Received order message: " + orderData);
    }
}