package com.DeltaFish.controller;

import com.DeltaFish.mapper.BookMapper;
import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.Book;
import com.DeltaFish.pojo.TUser;
import com.DeltaFish.utils.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
    @Autowired
    private TUserMapper tUserMapper;

    @Autowired
    private BookMapper bookMapper;


    @RequestMapping(value = "/Login")
    public String toLogin(Model model){
        model.addAttribute("tUser",new TUser());
        return "Login";
    }

    @RequestMapping(value = "person",method = RequestMethod.POST)
    public String toPerson(Model model, @ModelAttribute("tUser")TUser tUser){
        model.addAttribute("tUser", tUser);

        String name = tUser.getUserName();
        String psw = tUser.getPassword();

        System.out.println(name);
        System.out.println(psw);

        Md5 md5 = new Md5();
        psw = md5.MD5(psw);

        try {
            TUser userfind = tUserMapper.findUserByName(name);

            if(userfind.getPassword().equals(psw)) {
                System.out.println("Have found user : " + name);
                System.out.println("email is : " + userfind.getEmail() + ";   id is : " + userfind.getUserId());
                return "Mall";
            }else{
                System.out.println("Didnot find user : " + name);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        Book book = new Book();
        book.setBookId("0000000");
        book.setOperation("2");
        book.setEdition("0");
        book.setOwnerId("PB16061470");
        book.setBookName("fucking");
        try{
            bookMapper.insertSelective(book);
        }catch(Exception e){
            e.printStackTrace();
        }

        return "Login";
    }
}

