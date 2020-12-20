package com.test.jupiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JupiterApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(JupiterApplicationTest.class, args);
        System.out.println("Test application start");
    }

}
