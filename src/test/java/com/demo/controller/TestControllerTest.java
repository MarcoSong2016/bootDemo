package com.demo.controller;

import com.demo.BootdemoApplication;
import com.demo.service.impl.TestServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootdemoApplication.class)
public class TestControllerTest {
    @Autowired
    TestServiceImpl testService;

    @Test
    public void hello() throws Exception {
        Assert.assertEquals("hhh", testService.testMethod());
    }

}