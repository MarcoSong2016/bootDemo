package com.demo.service.impl;

import com.demo.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String testMethod() {
        return "hhh";
    }
}
