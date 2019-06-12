package com.niu.springboot.service;

import org.springframework.stereotype.Service;

/**
 * Created by ami on 2019/6/12.
 */
@Service
public class UserService {
    public String getUserById(Integer id){
        System.out.println("get.....");
        return "user";
    }

    public void deleteUserById(Integer id){
        System.out.println("delete....");
    }

}
