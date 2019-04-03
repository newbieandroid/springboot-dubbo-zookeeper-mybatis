package com.olanboa.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.olanboa.api.TestService;
import org.springframework.stereotype.Component;


@Component
@Service
public class DemoServiceImpl implements TestService {
    @Override
    public String getInfo() {
        return "测试内容";
    }
}
