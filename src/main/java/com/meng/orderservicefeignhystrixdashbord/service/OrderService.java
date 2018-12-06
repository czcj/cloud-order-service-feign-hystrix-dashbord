package com.meng.orderservicefeignhystrixdashbord.service;

import com.meng.orderservicefeignhystrixdashbord.service.fallback.OrderServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "product-service",fallback = OrderServiceFallback.class)
public interface OrderService {
    @RequestMapping("/product/getProduct")
    public String getPort(@RequestParam("id")String productId);
}
