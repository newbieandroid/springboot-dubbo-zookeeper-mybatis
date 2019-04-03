package com.olanboa.providerb;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ProviderbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderbApplication.class, args);
    }

}
