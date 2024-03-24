package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }

    @Bean
    public MyRepository myRepository() {
        return new MyRepository();
    }

    @Bean
    public MyComponent myComponent() {
        return new MyComponent();
    }

    @Bean
    public MyController myController() {
        return new MyController();
    }

    private class MyController {
    }
}