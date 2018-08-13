package com.DeltaFish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(value = "/User")
    public String User(){
        return "User";
    }
}
