package com.DeltaFish.controller;

import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.TUser;
import com.DeltaFish.service.impl.TUserMapperImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PageController {



    /**
     * 访问主页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("")
    public String showIndex() {
        return "MainWindow";
    }


    /**
     * 跳转主页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/MainWindow")
    public String showMainWindow() {
        return "MainWindow";
    }


    /**
     * 跳转登录页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/Login")
    public String showLogin() {
        return "Login";
    }


    /**
     * 跳转注册页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/Register")
    public String showRegister() {
        return "Register";
    }


    /**
     * 跳转交易市场页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/Mall")
    public String showMall() {
        return "Mall";
    }


    /**
     * 跳转商品详情页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/Detail")
    public String showDetail() {
        return "Detail";
    }


    /**
     * 跳转关于我们页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/AboutUs")
    public String showAboutUs() {
        return "AboutUs";
    }


    /**
     * 跳转404页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/404")
    public String show404() {
        return "404";
    }


}
