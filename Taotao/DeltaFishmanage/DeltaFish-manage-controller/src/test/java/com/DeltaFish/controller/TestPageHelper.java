package com.DeltaFish.controller;

import com.DeltaFish.mapper.TUserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPageHelper {

    @Test
    public void testPageHelper(){
        //创建一个Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");

        //从Spring容器中获得Mapper的代理对象
        applicationContext.getBean(TUserMapper.class);

        //执行查询，并分页

    }
}
