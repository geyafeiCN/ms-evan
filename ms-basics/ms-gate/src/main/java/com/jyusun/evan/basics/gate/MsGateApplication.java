package com.jyusun.evan.basics.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * 描述：网关中心引导程序
 *
 * @author JyuSun at ${DATE} ${HOUR}:${MINUTE}
 * @version 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MsGateApplication {


    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes().route( r -> r.path("/ms-weixin/**")
                .uri("http://httpbin.org")).build();
    }

    public static void main(String[] args) {
        SpringApplication.run(MsGateApplication.class, args);
    }
}
