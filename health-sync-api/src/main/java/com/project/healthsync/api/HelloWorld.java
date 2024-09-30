package com.project.healthsync.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String greet(){
        return "Hi, Paras created this.";
    }
}
