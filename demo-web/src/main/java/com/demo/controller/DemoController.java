package com.demo.controller;

import com.demo.service.DemoService;
import com.demo.util.DemoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zheng.Ke
 * Date 2017/4/10.
 */
@RequestMapping("/demo")
@RestController
public class DemoController {

    @Value("${deploy.type}")
    private String deployType;

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/sayHello")
    public String sayHello() {
        return demoService.sayHello() + " " + deployType;
    }
}
