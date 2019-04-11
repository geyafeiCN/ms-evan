package com.jyusun.evan.basics.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 作用描述：
 * - 网关配置中心引导程序
 * @author JyuSun at
 * @version 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsGatewayApplication.class, args);
    }
}
