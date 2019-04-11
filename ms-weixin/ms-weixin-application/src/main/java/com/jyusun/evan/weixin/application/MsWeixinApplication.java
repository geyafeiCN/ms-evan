package com.jyusun.evan.weixin.application;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 作用描述：
 * - 微信服务引导程序
 * @author jyusun
 */
@EnableSwagger2Doc
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class MsWeixinApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsWeixinApplication.class, args);
    }

}
