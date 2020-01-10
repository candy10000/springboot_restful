package com.yaxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.yaxing.*"})
public class SpringbootRestfulApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootRestfulApplication.class, args);

    }

}
