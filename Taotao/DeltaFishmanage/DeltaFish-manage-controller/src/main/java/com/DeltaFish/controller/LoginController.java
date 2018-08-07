package com.DeltaFish.controller;

import com.DeltaFish.mapper.BookMapper;
import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.Book;
import com.DeltaFish.pojo.TUser;
import com.DeltaFish.service.Impl.TUserServiceImpl;
import com.DeltaFish.service.TUserService;
import com.DeltaFish.utils.Md5;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
@SessionAttributes("userName")
public class LoginController {
    @Autowired
    private TUserMapper tUserMapper;

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private TUserService tUserService;


    @RequestMapping(value = "/Login")
    public String toLogin(Model model){
        model.addAttribute("tUser",new TUser());
        return "Login";
    }

    @RequestMapping(value = "person",method = RequestMethod.POST)
    public String toPerson(Model model, @ModelAttribute("tUser")TUser tUser) {
        model.addAttribute("tUser", tUser);

        String name = tUser.getUserName();
        String psw = tUser.getPassword();

        System.out.println(name);
        System.out.println(psw);

        boolean result = false;
        try {
            result = tUserService.login(name, psw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result) {
            System.out.println("Have found user : " + name + " !");
            return "Mall";
        }
        return "Login";
    }

    @RequestMapping("/checkUser")
    public @ResponseBody
    int checkUser(String userName) throws Exception {
        boolean result = tUserService.checkUserExist(userName);
        if (result) {
            System.out.println("User : " + userName + " did exist!");
            return 1;
        }else{
            System.out.println("User : " + userName + " did not exist!");
            return 0;
        }
    }

}

