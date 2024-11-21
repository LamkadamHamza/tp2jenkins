package com.example.tp2jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Tp2jenkinsApplication {

  public static void main(String[] args) {
    SpringApplication.run(Tp2jenkinsApplication.class, args);
  }


  @GetMapping("/test")
  public String hello() {
    return "Hello hamza";
  }
}
