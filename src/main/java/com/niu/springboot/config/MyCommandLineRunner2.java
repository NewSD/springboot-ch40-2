package com.niu.springboot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by ami on 2019/6/12.
 */
@Component
@Order(2)
public class MyCommandLineRunner2 implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner2......"+ Arrays.toString(args));
    }
}
