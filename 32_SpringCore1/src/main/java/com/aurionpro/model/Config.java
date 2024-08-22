package com.aurionpro.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.aurionpro.model")
public class Config {
//
//    @Bean
//    public Hardisk hardisk() {
//        return new Hardisk(500); // Example capacity
//    }
//
//    @Bean
//    public Computer computer() {
//        return new Computer("MyComputer", hardisk());
//    }
}
