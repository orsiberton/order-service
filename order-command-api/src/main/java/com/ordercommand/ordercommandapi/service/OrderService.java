package com.ordercommand.ordercommandapi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import com.ordercommand.ordercommandapi.service.model.Order;
import lombok.extern.slf4j.Slf4j;
import net.logstash.logback.argument.StructuredArguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Slf4j
@Service
public class OrderService {

    @Autowired
    public OrderService() {
    }

    @HystrixCommand(groupKey = "order", commandKey = "createOrder", fallbackMethod = "createOrderFallback")
    public Future<Void> createOrder(Order order) {
        return new AsyncResult<Void>() {
            @Override
            public Void invoke() {
                log.info("Sending order {} to command bus",
                        StructuredArguments.value("description", order.getDescription()));
                return null;
            }
        };
    }

    public Void createOrderFallback(Order order, Throwable ex) {
        log.error("Fail to create new order. {}", StructuredArguments.value("description", order.getDescription()), ex);
        return null;
    }
}
