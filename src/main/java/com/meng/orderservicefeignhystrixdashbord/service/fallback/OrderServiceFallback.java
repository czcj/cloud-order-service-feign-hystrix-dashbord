package com.meng.orderservicefeignhystrixdashbord.service.fallback;

import com.meng.orderservicefeignhystrixdashbord.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceFallback implements OrderService {
    @Override
    public String getPort(String productId) {
        return "hystrix::success";
    }
}
