package com.DeltaFish.manage;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.Reader;

public class BeforeTUserMapper {
    private static SqlSessionFactory sqlSessionFactory;
    @BeforeClass
    public static void init(){
        try{
            Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        }catch (IOException ignore) {
            ignore.printStackTrace();
        }
    }
    public SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
