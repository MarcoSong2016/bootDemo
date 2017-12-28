package com.demo.controller;

import com.demo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "test")
public class TestController {
    @Resource
    TestService testService;

    @GetMapping(value = "hello")
    public String hello() {
        return testService.testMethod();
    }
}
