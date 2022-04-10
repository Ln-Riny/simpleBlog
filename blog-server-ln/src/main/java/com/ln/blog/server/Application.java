package com.ln.blog.server;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lining
 * @date 2022/2/9
 **/
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        String str = "dffggdfgd";
        long startTime = System.currentTimeMillis();
        SpringApplication.run(Application.class);
        long endTime = System.currentTimeMillis();
        System.out.println("== Application start success [" + ((endTime - startTime) / 1000) + "s]");
    }
}
