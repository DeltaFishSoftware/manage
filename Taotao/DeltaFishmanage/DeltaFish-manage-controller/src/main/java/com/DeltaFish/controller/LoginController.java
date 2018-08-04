package com.DeltaFish.controller;

import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class LoginController {
    @Autowired
    private TUserMapper tUserMapper;


    @RequestMapping(value = "/Login")
    public String toLogin(Model model){
        model.addAttribute("tUser",new TUser());
        return "Login";
    }

    @RequestMapping("person")
    public String toPerson(){
        return "Mall";
    }
}
