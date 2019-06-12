package com.niu.springboot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by ami on 2019/6/12.
 * 数字越小先执行
 */
@Component
@Order(1)
public class MyCommandLineRunner1 implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner1......"+ Arrays.toString(args));
    }
}
