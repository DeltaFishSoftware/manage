package com.DeltaFish.service.Impl;

import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.TUser;
import com.DeltaFish.service.TUserService;
import com.DeltaFish.utils.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    TUserMapper tUserMapper;

    @Override
    public boolean login(String username, String password) {
        try {
            TUser tUser = tUserMapper.findUserByName(username);
            if(tUser != null) {
                Md5 md5 = new Md5();
                String psw = md5.MD5(password);
                if (tUser.getPassword().equals(psw)) {
                    return true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean checkUserExist(String user) {
        try {
            TUser tUser = tUserMapper.findUserByName(user);
            if (tUser != null) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
