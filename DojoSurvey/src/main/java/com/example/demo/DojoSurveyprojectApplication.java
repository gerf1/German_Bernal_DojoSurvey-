package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
public class DojoSurveyprojectApplication {
        public static void main(String[] args) {
                SpringApplication.run(DojoSurveyprojectApplication.class, args);
        }
        
      
}