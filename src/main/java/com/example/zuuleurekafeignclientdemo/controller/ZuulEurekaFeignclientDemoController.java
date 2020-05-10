package com.example.zuuleurekafeignclientdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulEurekaFeignclientDemoController {

    @RequestMapping(value = "/home")
    public String hello() {
        return "Hello from ZuulDemoController";
    }

    @RequestMapping(value = "/target")
    public String targetURL() {
        return "Hello from Target method of ZuulDemoController";
    }
}
