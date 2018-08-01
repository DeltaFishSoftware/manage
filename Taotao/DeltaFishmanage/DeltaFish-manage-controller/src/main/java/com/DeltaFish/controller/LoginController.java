package com.DeltaFish.controller;

import com.DeltaFish.pojo.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class LoginController {

   /* @RequestMapping(value = "/Register")
    public String toRegister(Model model){
        model.addAttribute("tuser",new TUser());
        return "Register";
    }

    @RequestMapping(value = "addUser")
    public String addUser(Model model, @Valid @ModelAttribute("tuser")TUser tuser, BindingResult  bindingResult) {

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
        model.addAttribute("tuser", tuser);
        System.out.println(tuser.getUserName());
        System.out.println(tuser.getUserId());
        System.out.println(tuser.getEmail());
        System.out.println(tuser.getPassword());

        return "Login";
    }
*/
    @RequestMapping("/Register")
    public ModelAndView showRegister(Model model){
        model.addAttribute("tUser", new TUser());

        ModelAndView modelAndView = new ModelAndView("Register");
        return modelAndView;
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public ModelAndView addUser(@Valid TUser tUser,
                                         BindingResult bindingResult){

        ModelAndView modelAndView = new ModelAndView();

        if(bindingResult.hasErrors()){
            modelAndView.setViewName("Register");
        }
        else{
            modelAndView.setViewName("Login");
            modelAndView.addObject("tUser", tUser);
        }

        return modelAndView;
    }


}
