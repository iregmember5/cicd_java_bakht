package com.bakht.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoappApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        int a = 5, b = 10;
        return "👋 Welcome to Java CI/CD Web App!<br>" +
               "Today's date: " + java.time.LocalDate.now() + "<br>" +
               "Sum of " + a + " + " + b + " = " + (a + b);
    }
}
