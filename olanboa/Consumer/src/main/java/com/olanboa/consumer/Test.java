package com.olanboa.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.olanboa.api.DemoService;
import com.olanboa.api.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Reference
    DemoService demoService;

    @Reference
    TestService testService;

    @RequestMapping("/getName")
    public String getName() {
        return testService.getInfo();
    }


    @RequestMapping("/getId")
    public int getDa() {
        return demoService.getData();
    }
}
