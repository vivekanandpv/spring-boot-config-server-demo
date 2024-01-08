package com.vivekanandpv.springbootconfigserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootConfigServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigServerDemoApplication.class, args);
    }

}
