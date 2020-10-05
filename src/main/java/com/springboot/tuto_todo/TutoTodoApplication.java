package com.springboot.tuto_todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class TutoTodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutoTodoApplication.class, args);
    }

}
