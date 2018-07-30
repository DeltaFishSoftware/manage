package com.DeltaFish.service.impl;

import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.TUser;
import com.DeltaFish.service.MyBatisUtil;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TUserMapperImpl implements TUserMapper{
    //@Insert("INSERT INTO t_user(user_name,user_id,password,email) VALUES(#{user_name},#{user_id},#{password},#{email})")
    //@Options(useGeneratedKeys = true,keyProperty = "id")
    @Override
    public int insertUser(TUser record) throws Exception{
        //获得会话对象
        SqlSession session= MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口TUserMapper，返回实例
            TUserMapper tUserMapper=session.getMapper(TUserMapper.class);
            return tUserMapper.insertUser(record);
        } finally {
            session.close();
        }
    }

    @Override
    public TUser findUserById(String id) throws Exception {
        //获得会话对象
        SqlSession session= MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口TUserMapper，返回实例
            TUserMapper tUserMapper=session.getMapper(TUserMapper.class);
            return tUserMapper.findUserById(id);
        } finally {
            session.close();
        }
    }

    @Override
    public TUser findUserByName(String name) throws Exception {
        //获得会话对象
        SqlSession session= MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口TUserMapper，返回实例
            TUserMapper tUserMapper=session.getMapper(TUserMapper.class);
            return tUserMapper.findUserByName(name);
        } finally {
            session.close();
        }
    }


    @Override
    public int deleteUser(String id) throws Exception {
        //获得会话对象
        SqlSession session= MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口TUserMapper，返回实例
            TUserMapper tUserMapper=session.getMapper(TUserMapper.class);
            return tUserMapper.deleteUser(id);
        } finally {
            session.close();
        }
    }

    @Override
    public List<TUser> selectAll() {
        //获得会话对象
        SqlSession session= MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口TUserMapper，返回实例
            TUserMapper tUserMapper=session.getMapper(TUserMapper.class);
            return tUserMapper.selectAll();
        } finally {
            session.close();
        }
    }
}
