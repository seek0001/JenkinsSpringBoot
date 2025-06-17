package com.example.HelloJenkinsDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Jenkins!";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Application is running!";
    }
}