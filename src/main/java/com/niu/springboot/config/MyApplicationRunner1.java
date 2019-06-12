package com.niu.springboot.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * Created by ami on 2019/6/12.
 */
@Component
@Order(2)
public class MyApplicationRunner1 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments arguments) throws Exception {
        List<String> nonOptionArgs = arguments.getNonOptionArgs();
        System.out.println("1-nonOptionArgs>>>"+nonOptionArgs);
        Set<String> optionNames = arguments.getOptionNames();
        for (String optionname: optionNames) {
            System.out.println("1-key:"+optionname+";value:"+arguments.getOptionValues(optionname));
        }
    }
}
