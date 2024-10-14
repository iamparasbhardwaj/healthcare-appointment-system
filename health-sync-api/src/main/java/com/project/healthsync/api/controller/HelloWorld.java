package com.project.healthsync.api.controller;

import com.project.healthsync.api.dao.UserDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
    private UserDao userRepository;

    HelloWorld(UserDao userRespository){
        this.userRepository=userRespository;
    }

    @GetMapping("/")
    public String greet(){
        if(userRepository!=null){
            return "user repo found";
        }
        return "Hi, Paras created this.";
    }
}
