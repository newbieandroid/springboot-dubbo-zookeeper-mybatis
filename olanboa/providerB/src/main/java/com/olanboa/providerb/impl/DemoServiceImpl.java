package com.olanboa.providerb.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.olanboa.api.DemoService;
import org.springframework.stereotype.Component;

@Component
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public int getData() {
        return 99999;
    }
}
