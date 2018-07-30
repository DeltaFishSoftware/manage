package com.DeltaFish.manage;

import com.DeltaFish.mapper.BooksMapper;
import com.DeltaFish.pojo.Books;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class TestBooksMapper extends BeforeBooksMapper{
    @Test
    public void testInsertUser(){
        SqlSession sqlSession = getSqlSession();
        try{
            // 获取RoleMapper接口
            BooksMapper roleMapper = sqlSession.getMapper(BooksMapper.class);
            Books sysRole = new Books();
            sysRole.setOwnerId("PB16002222");
            sysRole.setBookId("a11111111");
            sysRole.setBookName("东方树叶");
            sysRole.setEdition("第一版");
            sysRole.setOperation("2");
            // 新增用,返回受影响的行数
            int result = roleMapper.insertSelective(sysRole);
            System.out.print(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            //sqlSession.commit(); //commit到mysql？
            sqlSession.close();
        }
    }
}