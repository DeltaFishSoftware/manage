package com.DeltaFish.controller;

import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.TUser;
import com.DeltaFish.service.MyBatisUtil;
import com.DeltaFish.service.impl.TUserMapperImpl;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NeedMapper {
    static TUserMapper tUserMapper;

    @ModelAttribute
    public static void loadMapper()
    {
        tUserMapper = new TUserMapperImpl();
    }


    /**访问登录页
     * @return
     * @throws Exception
     */

    @RequestMapping(value="/LoginCheck")
    public String toLogin(@RequestParam String userName, @RequestParam String password){

        List<TUser> tusers = tUserMapper.selectAll();

        if(userName.equals(tusers.get(0).getUserName()) && password.equals(tusers.get(0).getPassword()))
            return "Homepage";
        /*else if(userName.equals(tusers.get(1).getUserName()) && password.equals(tusers.get(1).getPassword()))
            return "Czk";
        else if(userName.equals(tusers.get(2).getUserName()) && password.equals(tusers.get(2).getPassword()))
            return "Trinidad";*/
        else
            return "404";
    }

    @RequestMapping(value = "/ReCheck")
    public String toRegister(@RequestParam String user_name,@RequestParam String password,@RequestParam String email,@RequestParam String user_id){

        SqlSession session = MyBatisUtil.getSession();
        TUser tu =new TUser();
        tu.setUserName(user_name);
        tu.setPassword(password);
        tu.setEmail(email);
        tu.setUserId(user_id);
        TUserMapper tUM=session.getMapper(TUserMapper.class);
        //tUM.insertUser(tu);

        System.out.println(tu.getUserId());
        session.commit();
        session.close();
        return "Homepage";
    }
}
