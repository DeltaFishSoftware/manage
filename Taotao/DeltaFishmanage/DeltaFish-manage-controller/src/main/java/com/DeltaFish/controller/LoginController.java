package com.DeltaFish.controller;

import com.DeltaFish.pojo.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;


@Controller
public class LoginController {

    @RequestMapping(value = "/Register")
    public String toRegister(Model model){
        model.addAttribute("tUser",new TUser());
        return "Register";
    }

    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public String addUser(Model model, @Valid @ModelAttribute("tUser")TUser tUser, BindingResult  bindingResult) {

        if (bindingResult.getErrorCount() > 0) {
            List<ObjectError> results = bindingResult.getAllErrors();
            //准备在页面输出errors，页面使用jstl遍历
            model.addAttribute("errors", results);
            for (ObjectError error : results) {
                //输出错误信息
                System.out.println(error.getDefaultMessage());
            }

            return "Register";
        }
        model.addAttribute("tUser", tUser);
        System.out.println(tUser.getUserName());
        System.out.println(tUser.getEmail());
        System.out.println(tUser.getPassword());

        return "Login";
    }

   /* /*
    @RequestMapping("/Register")
    public ModelAndView showRegister(Model model){
        model.addAttribute("tUser", new TUser());

        ModelAndView modelAndView = new ModelAndView("Register");
        return modelAndView;
    }

    @ModelAttribute
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public ModelAndView addUser(){

        ModelAndView modelAndView = new ModelAndView();

        TUser tUser = new TUser();


        modelAndView.setViewName("Login");
        modelAndView.addObject("tUser", tUser);

        System.out.println(tUser.getUserName());
        System.out.println(tUser.getUserId());
        System.out.println(tUser.getEmail());
        System.out.println(tUser.getPassword());

        return modelAndView;
    }


    @RequestMapping(value = "personal",method = RequestMethod.POST)
    public String toLogin(){
        return "Mall";
    }*/
}
