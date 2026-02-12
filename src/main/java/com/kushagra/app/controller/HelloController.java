package com.kushagra.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String sayHello(HttpServletRequest request){
        return "Hello World " + request.getSession().getId();
    }

    @GetMapping("about")
    public String aboutOwner(HttpServletRequest request){
        return "Kushagra  " + request.getSession().getId();
    }

}
