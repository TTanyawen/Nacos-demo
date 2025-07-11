package com.example.controller;

import com.example.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private StockFeignService stockFeignService;
    @RequestMapping("/test")
    public String test() {
        return stockFeignService.test("order调用stock服务测试");
    }
}
