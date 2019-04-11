package com.jyusun.evan.member.infrastructure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.jyusun.evan.*.infrastructure.repository.mapper")
public class MsMemberInfrastructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsMemberInfrastructureApplication.class, args);
    }

}
