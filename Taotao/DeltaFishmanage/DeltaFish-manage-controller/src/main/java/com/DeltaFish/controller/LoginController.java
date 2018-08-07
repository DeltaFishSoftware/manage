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
import java.util.List;
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
           /*//book 插入测试 已成功
            Book book = new Book();
            book.setBookName(name + "Learning");
            book.setOwnerId(name);
            book.setEdition("2");
            book.setOperation("1");
            book.setBookId("0000");
            try {
                bookMapper.insertSelective(book);
                System.out.println("插入成功！");
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("插入失败！");
            }*/
           /*//book 分页测试 已成功
            Integer page = 1;
            Integer pageSize = 3;
            Integer start = (page - 1) * pageSize;
            Integer end = page * pageSize;
            try {
                List<Book> bookList = bookMapper.listByPage(start, end);
                for (Book book :bookList){
                    System.out.println(book);
                }
                System.out.println("书籍分页成功！");
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("书籍分页失败！");
            }
            */
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

