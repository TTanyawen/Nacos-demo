package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-stock")
public interface StockFeignService {

    @RequestMapping("/stock/test")
    public String test(@RequestParam("info") String info);
}
