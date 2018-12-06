package com.meng.orderservicefeignhystrixdashbord.controller;

import com.meng.orderservicefeignhystrixdashbord.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("getOrder")
    public String getOrder(){
        return orderService.getPort("order-service-feign-hystric-dashbord");
    }
}
