package com.DeltaFish.mapper;

import com.DeltaFish.pojo.TUser;

import java.util.List;

public interface TUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Sat May 05 16:02:56 CST 2018
     */
    int insertUser(TUser record) throws Exception;

    TUser findUserById(String id) throws Exception;

    TUser findUserByName(String name) throws Exception;

    int deleteUser(String id) throws Exception;

    List<TUser> selectAll();
}