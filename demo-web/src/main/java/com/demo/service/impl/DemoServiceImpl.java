package com.demo.service.impl;

import com.demo.service.DemoService;
import com.demo.util.DemoUtils;
import org.springframework.stereotype.Service;

/**
 * Created by Zheng.Ke
 * Date 2017/4/10.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        return DemoUtils.sayHello();
    }
}
