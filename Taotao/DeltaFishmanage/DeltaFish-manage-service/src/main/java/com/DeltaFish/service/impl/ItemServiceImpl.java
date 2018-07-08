package com.DeltaFish.service.impl;

import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.TUser;
import com.DeltaFish.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TUserMapper userMapper;//注入接口代理对象

    @Override
    public List<TUser> getAllUser() {
        List<TUser> list = userMapper.selectAll();
        return list;
    }
}
