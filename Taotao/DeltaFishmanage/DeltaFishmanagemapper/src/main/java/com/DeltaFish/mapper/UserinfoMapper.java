package com.DeltaFish.mapper;

import com.DeltaFish.pojo.Userinfo;

public interface UserinfoMapper {
    int insert(Userinfo record);

    int insertSelective(Userinfo record);
}