package com.niu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringbootCh4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCh4Application.class, args);
	}

}
