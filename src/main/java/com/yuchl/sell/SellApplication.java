package com.yuchl.sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SellApplication {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(SellApplication.class, args);
    }
}
