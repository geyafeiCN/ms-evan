package com.jyusun.evan.basics.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述：注册中心引导程序
 *
 * @author JyuSun at ${DATE} ${HOUR}:${MINUTE}
 * @version 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class MsCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCenterApplication.class, args);
    }

}
