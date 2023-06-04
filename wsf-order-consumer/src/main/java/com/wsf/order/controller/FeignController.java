package com.wsf.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @GetMapping("/echo/{str}")
    @SentinelResource("/feign/echo")
    public String echo(@PathVariable String str) {
       return str;
    }
}
