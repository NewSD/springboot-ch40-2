package com.niu.springboot.controller;

import com.niu.springboot.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ami on 2019/6/12.
 */
@RestController
public class HelloController {
    @Autowired
    Hello hello;

    @GetMapping("/hello")
    public String hello() {
        return hello.sayHello("江南一点雨");
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
