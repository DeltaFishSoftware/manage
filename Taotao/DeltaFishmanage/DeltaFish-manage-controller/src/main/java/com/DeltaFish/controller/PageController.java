package com.DeltaFish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @RequestMapping("")
    public String showIndex(){
        return "Login";
    }

    /**访问登录页
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/Login_do")
    public String toLogin(@RequestParam String userName, @RequestParam String password){

        if("Trinidad".equals(userName) && "password".equals(password))
            return "Trinidad";
        else
            return "error";
    }

    @RequestMapping("/Login/Trinidad")
    public String returnTrinidad(){
        return "Trinidad";
    }
}
