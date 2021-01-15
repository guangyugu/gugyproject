package org.gugy.gugyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("org.gugy.gugyproject.mapper")
public class GugyprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(GugyprojectApplication.class, args);

    }
}
