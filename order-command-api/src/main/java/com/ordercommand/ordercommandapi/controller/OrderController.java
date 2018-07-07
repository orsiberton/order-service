package com.ordercommand.ordercommandapi.controller;

import com.ordercommand.ordercommandapi.controller.dto.OrderDto;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/order")
public class OrderController {

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void createOrder(@RequestBody OrderDto orderDto) {
        log.info("Order {} created!", orderDto.getOrderId());
    }

//    @GetMapping
//    public ResponseEntity getOk() {
//        log.info("OK");
//        return ResponseEntity.ok("OK");
//    }
}
