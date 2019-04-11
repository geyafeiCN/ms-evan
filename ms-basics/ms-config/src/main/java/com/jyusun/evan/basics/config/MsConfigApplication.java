package com.jyusun.evan.basics.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * 描述：配置中心引导程序
 *
 * @author JyuSun at ${DATE} ${HOUR}:${MINUTE}
 * @version 1.0.0
 */


@EnableDiscoveryClient
@EnableConfigServer
@EnableAutoConfiguration
public class MsConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConfigApplication.class, args);
    }
}
