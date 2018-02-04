package com.mvn.simpleweb;

// USE THIS AS BASIC SPRING WEB APPLICATION !!!!!!!!!!!!!!!!!!!!!!!!
// Open browser and type localhost:8080/ and refresh
// Can run this without anything in application.properties file (Spring uses defaults) - did that and it showed 'Hi Maggie' in browser
// Can also add to application.properties file
// Refer to https://javapointers.com/tutorial/simple-spring-boot-web-application-using-maven/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }	
	
}
