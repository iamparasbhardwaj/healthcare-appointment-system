package com.project.healthsync.api;

import com.project.healthsync.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    private UserRepository userRepository;

    HelloWorld(UserRepository userRespository){
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
