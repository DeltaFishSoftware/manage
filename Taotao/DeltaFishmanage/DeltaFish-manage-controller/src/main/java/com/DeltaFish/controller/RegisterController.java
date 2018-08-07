package com.DeltaFish.controller;

import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.TUser;
import com.DeltaFish.service.impl.TUserMapperImpl;
import com.DeltaFish.utils.Md5;
import javafx.scene.control.Alert;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RegisterController {

    @Autowired
    private TUserMapper tUserMapper;


    @RequestMapping(value = "/Register")
    public String toRegister(Model model){
        model.addAttribute("tUser",new TUser());
        return "Register";
    }

    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public String addUser(Model model, @ModelAttribute("tUser")TUser tUser) {

        model.addAttribute("tUser", tUser);

        TUser usernew = new TUser();

        String name = tUser.getUserName();
        String psw = tUser.getPassword();
        String email = tUser.getEmail();
        String id = "PB00000000";//注册界面不要求输入学号，新用户学号初始赋值

        System.out.println(name);
        System.out.println(email);
        System.out.println(psw);

        //密码 MD5 加密
        Md5 md5 = new Md5();
        psw = md5.MD5(psw);
        System.out.println(psw);

        //插入用户到数据库
        usernew.setUserName(name);
        usernew.setEmail(email);
        usernew.setPassword(psw);
        usernew.setUserId(id);
        try{
            tUserMapper.insertUser(usernew);
        }catch (Exception e){
            e.printStackTrace();
            return "Register";
        }
        return "Login";

    }
}
